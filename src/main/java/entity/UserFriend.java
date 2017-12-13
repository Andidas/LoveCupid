package entity;

public class UserFriend {
    private Integer ufid;

    private Integer ufstartheight;

    private Integer ufendheighe;

    private Integer ufstartage;

    private Integer ufendage;

    private String ufdegree;

    private Integer ufstartsal;

    private Integer ufendsal;

    private String ufapartment;

    public Integer getUfid() {
        return ufid;
    }

    public void setUfid(Integer ufid) {
        this.ufid = ufid;
    }

    public Integer getUfstartheight() {
        return ufstartheight;
    }

    public void setUfstartheight(Integer ufstartheight) {
        this.ufstartheight = ufstartheight;
    }

    public Integer getUfendheighe() {
        return ufendheighe;
    }

    public void setUfendheighe(Integer ufendheighe) {
        this.ufendheighe = ufendheighe;
    }

    public Integer getUfstartage() {
        return ufstartage;
    }

    public void setUfstartage(Integer ufstartage) {
        this.ufstartage = ufstartage;
    }

    public Integer getUfendage() {
        return ufendage;
    }

    public void setUfendage(Integer ufendage) {
        this.ufendage = ufendage;
    }

    public String getUfdegree() {
        return ufdegree;
    }

    public void setUfdegree(String ufdegree) {
        this.ufdegree = ufdegree == null ? null : ufdegree.trim();
    }

    public Integer getUfstartsal() {
        return ufstartsal;
    }

    public void setUfstartsal(Integer ufstartsal) {
        this.ufstartsal = ufstartsal;
    }

    public Integer getUfendsal() {
        return ufendsal;
    }

    public void setUfendsal(Integer ufendsal) {
        this.ufendsal = ufendsal;
    }

    public String getUfapartment() {
        return ufapartment;
    }

    public void setUfapartment(String ufapartment) {
        this.ufapartment = ufapartment == null ? null : ufapartment.trim();
    }
}