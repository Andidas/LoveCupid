package entity;

public class MemberScreen {
    private Integer msid;

    private String mslogintime;

    private String mshouse;

    private String mscar;

    private String msconstellation;

    private String msprofession;

    private String msnation;

    private String msbirthplace;

    private String mshan;

    public Integer getMsid() {
        return msid;
    }

    public void setMsid(Integer msid) {
        this.msid = msid;
    }

    public String getMslogintime() {
        return mslogintime;
    }

    public void setMslogintime(String mslogintime) {
        this.mslogintime = mslogintime == null ? null : mslogintime.trim();
    }

    public String getMshouse() {
        return mshouse;
    }

    public void setMshouse(String mshouse) {
        this.mshouse = mshouse == null ? null : mshouse.trim();
    }

    public String getMscar() {
        return mscar;
    }

    public void setMscar(String mscar) {
        this.mscar = mscar == null ? null : mscar.trim();
    }

    public String getMsconstellation() {
        return msconstellation;
    }

    public void setMsconstellation(String msconstellation) {
        this.msconstellation = msconstellation == null ? null : msconstellation.trim();
    }

    public String getMsprofession() {
        return msprofession;
    }

    public void setMsprofession(String msprofession) {
        this.msprofession = msprofession == null ? null : msprofession.trim();
    }

    public String getMsnation() {
        return msnation;
    }

    public void setMsnation(String msnation) {
        this.msnation = msnation == null ? null : msnation.trim();
    }

    public String getMsbirthplace() {
        return msbirthplace;
    }

    public void setMsbirthplace(String msbirthplace) {
        this.msbirthplace = msbirthplace == null ? null : msbirthplace.trim();
    }

    public String getMshan() {
        return mshan;
    }

    public void setMshan(String mshan) {
        this.mshan = mshan == null ? null : mshan.trim();
    }
}