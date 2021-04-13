package lession_pack.doctors;

import java.util.ArrayList;
import java.util.List;

public class neuroSurgeon extends surgeon{
    public neuroSurgeon()
    {
        operationTableStatus = false;
        knownIllnessesCount = 0;
        canOperateHead = false;
    }
    private boolean canOperateHead;
    private Integer knownIllnessesCount;
    private boolean operationTableStatus;
    private List<neuroIllness>KnownNeuroIllnesses = new ArrayList<>();

    @Override
    public boolean doDoctorWork(String patientName, String syndromes) {
       if(canOperateHead == false)
       {
           System.out.println("Doctor "+ doctorName +" is not ready. Come later");
           return false;
       }
       if(operationTableStatus == false)
       {
           System.out.println("Operation table is not ready. Come later");
       }
        getPatient(patientName);
       listenSyndromes(syndromes);
       System.out.println("this illness is:" + checkKnownIllnesses());
       if(KnownNeuroIllnesses.get(currentSyndromeNumber).getOperationDifficulty() < 50)
       {
           System.out.println("Its too dangerous to do this operation");
           return false;
       }
       return giveHealing(KnownIllnesses.get(currentSyndromeNumber).getIllnessName());

    }

    public void teachNewIllness(String Illness, String syndromes, Integer operationDifficulty, boolean canHeal) {
        Illnesses temp = new Illnesses();
        temp.setIllnessName(Illness);
        temp.setSyndromes(syndromes);
        temp.setCanHeal(canHeal);
        temp.setIllnessMedicine(Illness + "-operation");
        KnownIllnesses.add(temp);
        knownIllnessesCount++;
        neuroIllness temp2 = new neuroIllness();
        temp2.setOperationDifficulty(operationDifficulty);
        KnownNeuroIllnesses.add(temp2);
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() +
                "canOperateHead=" + canOperateHead +
                ", knownIllnessesCount=" + knownIllnessesCount +
                ", operationTableStatus=" + operationTableStatus +
                ", KnownNeuroIllnesses=" + KnownNeuroIllnesses.size();

    }

    public void setCanOperateHead() {
        canOperateHead = !canOperateHead;
        if(canOperateHead == true)
        {
            System.out.println("doctor ready to operation");
        }
        else
            System.out.println("doctor is not ready to operation");
    }

    public void setOperationTableStatus() {
        operationTableStatus = !operationTableStatus;
        if(operationTableStatus == true)
        {
            System.out.println("Operation table ready");
        }
        else
        {
            System.out.println("Operation table is not ready");
        }

    }

    class neuroIllness
    {
        private Integer operationDifficulty;

        public Integer getOperationDifficulty() {
            return operationDifficulty;
        }

        public void setOperationDifficulty(Integer operationDifficulty) {
            this.operationDifficulty = operationDifficulty;
        }
    }
}

