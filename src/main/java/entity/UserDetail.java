package entity;

public class UserDetail {
    private Integer udid;

    private String udhousehold;

    private String udhouse;

    private String udcar;

    private String udnation;

    private String udbirthplace;

    private String udrank;

    private String udchild;

    private String udconstellation;

    private String udblood;

    private String udzodiac;

    private String udfaith;

    public Integer getUdid() {
        return udid;
    }

    public void setUdid(Integer udid) {
        this.udid = udid;
    }

    public String getUdhousehold() {
        return udhousehold;
    }

    public void setUdhousehold(String udhousehold) {
        this.udhousehold = udhousehold == null ? null : udhousehold.trim();
    }

    public String getUdhouse() {
        return udhouse;
    }

    public void setUdhouse(String udhouse) {
        this.udhouse = udhouse == null ? null : udhouse.trim();
    }

    public String getUdcar() {
        return udcar;
    }

    public void setUdcar(String udcar) {
        this.udcar = udcar == null ? null : udcar.trim();
    }

    public String getUdnation() {
        return udnation;
    }

    public void setUdnation(String udnation) {
        this.udnation = udnation == null ? null : udnation.trim();
    }

    public String getUdbirthplace() {
        return udbirthplace;
    }

    public void setUdbirthplace(String udbirthplace) {
        this.udbirthplace = udbirthplace == null ? null : udbirthplace.trim();
    }

    public String getUdrank() {
        return udrank;
    }

    public void setUdrank(String udrank) {
        this.udrank = udrank == null ? null : udrank.trim();
    }

    public String getUdchild() {
        return udchild;
    }

    public void setUdchild(String udchild) {
        this.udchild = udchild == null ? null : udchild.trim();
    }

    public String getUdconstellation() {
        return udconstellation;
    }

    public void setUdconstellation(String udconstellation) {
        this.udconstellation = udconstellation == null ? null : udconstellation.trim();
    }

    public String getUdblood() {
        return udblood;
    }

    public void setUdblood(String udblood) {
        this.udblood = udblood == null ? null : udblood.trim();
    }

    public String getUdzodiac() {
        return udzodiac;
    }

    public void setUdzodiac(String udzodiac) {
        this.udzodiac = udzodiac == null ? null : udzodiac.trim();
    }

    public String getUdfaith() {
        return udfaith;
    }

    public void setUdfaith(String udfaith) {
        this.udfaith = udfaith == null ? null : udfaith.trim();
    }
}