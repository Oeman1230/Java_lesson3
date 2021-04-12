package lession_pack.doctors;

import java.util.ArrayList;
import java.util.List;

public class surgeon implements doctorActions{
    protected String doctorName;
    protected Integer yearsInWork;
    protected String currentPatientName;
    protected String currentSyndrome;
    protected Integer currentSyndromeNumber;
    private List<Illnesses> KnownIllnesses = new ArrayList<>();

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setYearsInWork(Integer yearsInWork) {
        this.yearsInWork = yearsInWork;
    }

    public Integer getYearsInWork() {
        return yearsInWork;
    }

    @Override
    public boolean giveHealing(String IllnessName) {
        System.out.println(doctorName + " thinking about medicine");
        if(KnownIllnesses.get(currentSyndromeNumber).getCanHeal() != false)
        {
                System.out.println(currentPatientName + " is cured by " + KnownIllnesses.get(currentSyndromeNumber).getIllnessMedicine());
                return true;
        }
        System.out.println(doctorName+ ": I cant heal " + currentSyndrome);
        return false;
    }

    @Override
    public void teachNewIllness(String Illness, String syndromes) {

        Illnesses temp = new Illnesses();
        temp.setIllnessName(Illness);
        temp.setCanHeal(true);
        temp.setSyndromes(syndromes);
        temp.setIllnessMedicine(Illness + "medicine");
        KnownIllnesses.add(temp);
    }

    @Override
    public String checkKnownIllnesses() {
        System.out.println(doctorName + " thinking about:" + currentSyndrome);
        Integer i = 0;
        while(KnownIllnesses.iterator().hasNext())
        {
            if(KnownIllnesses.iterator().next().getSyndromes().equals(currentSyndrome))
            {
                System.out.println("idea");
                currentSyndromeNumber = i;
                return KnownIllnesses.get(i).getIllnessName();
            }
            i++;
        }
        return "Unknown illness";
    }

    @Override
    public void listenSyndromes(String syndromes) {
    System.out.println(syndromes);
    currentSyndrome = syndromes;
    }

    @Override
    public void getPatient(String patientName) {
        System.out.println(patientName + " visit " + doctorName);
        currentPatientName = patientName;
    }

    @Override
    public boolean doDoctorWork(String patientName, String syndromes) {
        getPatient(patientName);
        listenSyndromes(syndromes);
        StringBuffer buf = new StringBuffer();
        buf.append(checkKnownIllnesses());
        System.out.println(buf.substring(0));
         return giveHealing(buf.substring(0));

    }
    protected class Illnesses
    {
        private String IllnessName;
        private String IllnessMedicine;
        private String Syndromes;
        private boolean canHeal;

        public void setIllnessName(String illnessName) {
            IllnessName = illnessName;
        }

        public void setIllnessMedicine(String illnessMedicine) {
            IllnessMedicine = illnessMedicine;
        }

        public void setCanHeal(boolean canHeal) {
            this.canHeal = canHeal;
        }

        public void setSyndromes(String syndromes) {
            Syndromes = syndromes;
        }

        public String getSyndromes() {
            return Syndromes;
        }

        public String getIllnessMedicine() {
            return IllnessMedicine;
        }
        public boolean getCanHeal()
        {
            return canHeal;
        }
        public String getIllnessName() {
            return IllnessName;
        }
    }
}
