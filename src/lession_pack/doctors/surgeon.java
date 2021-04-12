package lession_pack.doctors;

import java.util.ArrayList;
import java.util.List;

public class surgeon implements doctorActions{
    protected String doctorName;
    protected Integer yearsInWork;
    protected String currentPatientName;
    List<Illnesses> KnownIllnesses = new ArrayList<>();

    @Override
    public void giveHealing(String IllnessName) {

    }

    @Override
    public void teachNewIllness(String Illness) {

    }

    @Override
    public String checkKnownIllnesses() {
        return null;
    }

    @Override
    public void listenSyndromes(String syndromes) {

    }

    @Override
    public void getPatient(String patientName) {

    }

    @Override
    public boolean doDoctorWork(String patientName, String syndromes) {


        return false;
    }
    protected class Illnesses
    {
        private String IllnessName;
        private String IllnessMedicine;
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
    }
}
