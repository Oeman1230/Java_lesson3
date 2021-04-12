package lession_pack.doctors;

public interface doctorActions {
    boolean doDoctorWork(String patientName, String syndromes);
    void getPatient(String patientName);
    void listenSyndromes(String syndromes);
    String checkKnownIllnesses();
    void teachNewIllness(String Illness, String syndromes);
    boolean giveHealing(String IllnessName);
}
