package entity;

public class SelfNomination {
    private Integer snid;

    private String snsex;

    private String snself;

    private String snrequired;

    private String snphoto;

    public Integer getSnid() {
        return snid;
    }

    public void setSnid(Integer snid) {
        this.snid = snid;
    }

    public String getSnsex() {
        return snsex;
    }

    public void setSnsex(String snsex) {
        this.snsex = snsex == null ? null : snsex.trim();
    }

    public String getSnself() {
        return snself;
    }

    public void setSnself(String snself) {
        this.snself = snself == null ? null : snself.trim();
    }

    public String getSnrequired() {
        return snrequired;
    }

    public void setSnrequired(String snrequired) {
        this.snrequired = snrequired == null ? null : snrequired.trim();
    }

    public String getSnphoto() {
        return snphoto;
    }

    public void setSnphoto(String snphoto) {
        this.snphoto = snphoto == null ? null : snphoto.trim();
    }
}