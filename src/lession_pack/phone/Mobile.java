package lession_pack.phone;

public interface Mobile {
    void doPhoneRing();
    void sendSMS(String personWhom, String message);
    void getSMSFrom(String personFrom, String message);
    void phoneCall(String personWhom);
    void getPhoneCall(String personFrom);
}
