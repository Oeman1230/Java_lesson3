package lession_pack.phone;

public abstract class SiemensMobile implements Mobile {

    protected String phoneOwner;
    protected Integer phoneNumber;
    protected Integer phoneCameraMPix;
    protected Integer phoneCameraCount;
    protected Integer phoneMemorySize;

    public void setPhoneOwner(String phoneOwner) {
        this.phoneOwner = phoneOwner;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneCameraCount(Integer phoneCameraCount) {
        this.phoneCameraCount = phoneCameraCount;
    }

    public void setPhoneCameraMPix(Integer phoneCameraMPix) {
        this.phoneCameraMPix = phoneCameraMPix;
    }

    public void setPhoneMemorySize(Integer phoneMemorySize) {
        this.phoneMemorySize = phoneMemorySize;
    }
    public String getPhoneOwner()
    {
        return phoneOwner;
    }
    public String getPhoneInfo() {
        return
                "phoneOwner='" + phoneOwner + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", phoneCameraMPix=" + phoneCameraMPix +
                ", phoneCameraCount=" + phoneCameraCount +
                ", phoneMemorySize=" + phoneMemorySize +
                " gigabytes" + System.lineSeparator();
    }

    @Override
    public void doPhoneRing() {
        System.out.println("ring-ring");
        System.out.println(phoneOwner + " phone is ringing");
    }

    @Override
    public void sendSMS(String personWhom, String message) {
        System.out.println("You sent a message:" + message + " to: " + personWhom);
    }

    @Override
    public void getSMSFrom(String personFrom, String message) {
        doPhoneRing();
        System.out.println("User: " + personFrom + " send a message: " + message);
    }

    @Override
    public void phoneCall( String PersonWhom) {
        System.out.println("you calls to: " + PersonWhom );
    }

    @Override
    public void getPhoneCall(String personFrom) {
        doPhoneRing();
        System.out.println(personFrom + " is calling for you," + phoneOwner);
    }

}
