package entity;

public class FeedBack {
    private Integer fbid;

    private Integer fbphone;

    private String fbcontent;

    private String fbtype;

    public Integer getFbid() {
        return fbid;
    }

    public void setFbid(Integer fbid) {
        this.fbid = fbid;
    }

    public Integer getFbphone() {
        return fbphone;
    }

    public void setFbphone(Integer fbphone) {
        this.fbphone = fbphone;
    }

    public String getFbcontent() {
        return fbcontent;
    }

    public void setFbcontent(String fbcontent) {
        this.fbcontent = fbcontent == null ? null : fbcontent.trim();
    }

    public String getFbtype() {
        return fbtype;
    }

    public void setFbtype(String fbtype) {
        this.fbtype = fbtype == null ? null : fbtype.trim();
    }
}