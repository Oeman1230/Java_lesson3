package lession_pack.phone;

public class Model extends SiemensMobile {
    private Integer modelNumber;
    private boolean fiveGAvailable;
    private String OSname;
    private Integer OSversion;
    private boolean InternetConnection;

    public void setFiveGAccess() {
        if(fiveGAvailable = false) {
            fiveGAvailable = true;
        }
        else
            fiveGAvailable = false;
    }

    public void setModelNumber(Integer modelNumber) {
        this.modelNumber = modelNumber;
    }

    public void setInternetConnection()
    {
        if(InternetConnection = false)
        {
            InternetConnection = true;
        }
        else
            InternetConnection = false;
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

}
