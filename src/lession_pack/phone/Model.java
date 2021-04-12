package lession_pack.phone;

public class Model extends SiemensMobile {
    public Model()
    {
        fiveGAvailable = false;
        InternetConnection = false;
    }
    private Integer modelNumber;
    private boolean fiveGAvailable;
    private String OSname;
    private Integer OSversion;
    private boolean InternetConnection;

    public void setFiveGAccess() {
        fiveGAvailable = !fiveGAvailable;
    }

    public void setModelNumber(Integer modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setInternetConnection()
    {
       InternetConnection = !InternetConnection;
    }
    public void setOSname(String OSname) {
        this.OSname = OSname;
    }

    public void setOSversion(Integer OSversion) {
        this.OSversion = OSversion;
    }

    public Integer getOSversion() {
        return OSversion;
    }

    public Integer getModelNumber() {
        return modelNumber;
    }

    public String getOSname() {
        return OSname;
    }
    public boolean getInternetStatus()
    {
        return InternetConnection;
    }
    public boolean getFiveGAvailable()
    {
        return fiveGAvailable;
    }

    public String getModelInfo() {
        return getPhoneInfo() +
                "modelNumber=" + modelNumber +
                ", fiveGAvailable=" + fiveGAvailable +
                ", OSname='" + OSname + '\'' +
                ", OSversion=" + OSversion +
                ", InternetConnection=" + InternetConnection ;
    }

}
