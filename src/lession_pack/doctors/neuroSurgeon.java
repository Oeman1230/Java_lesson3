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
    private List<neuroIllness>KnownIllnesses = new ArrayList<>();

    public void teachNewIllness(String Illness, String syndromes, Integer operationDifficulty, boolean canHeal) {
        neuroIllness temp = new neuroIllness();
        temp.operationDifficulty = operationDifficulty;
        temp.setIllnessName(Illness);
        temp.setSyndromes(syndromes);
        temp.setCanHeal(canHeal);
        KnownIllnesses.add(temp);
        knownIllnessesCount++;
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

    class neuroIllness extends Illnesses
    {
        private Integer operationDifficulty;

        public void setOperationDifficulty(Integer operationDifficulty) {
            this.operationDifficulty = operationDifficulty;
        }
    }
}

