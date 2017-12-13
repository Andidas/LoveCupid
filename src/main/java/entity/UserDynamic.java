package entity;

public class UserDynamic {
    private Integer udnid;

    private String udntype;

    private String udntopic;

    private String udncontent;

    private String udnphoto;

    private Integer ubid;

    public Integer getUdnid() {
        return udnid;
    }

    public void setUdnid(Integer udnid) {
        this.udnid = udnid;
    }

    public String getUdntype() {
        return udntype;
    }

    public void setUdntype(String udntype) {
        this.udntype = udntype == null ? null : udntype.trim();
    }

    public String getUdntopic() {
        return udntopic;
    }

    public void setUdntopic(String udntopic) {
        this.udntopic = udntopic == null ? null : udntopic.trim();
    }

    public String getUdncontent() {
        return udncontent;
    }

    public void setUdncontent(String udncontent) {
        this.udncontent = udncontent == null ? null : udncontent.trim();
    }

    public String getUdnphoto() {
        return udnphoto;
    }

    public void setUdnphoto(String udnphoto) {
        this.udnphoto = udnphoto == null ? null : udnphoto.trim();
    }

    public Integer getUbid() {
        return ubid;
    }

    public void setUbid(Integer ubid) {
        this.ubid = ubid;
    }
}