package entity;

public class SuccessfulStory {
    private Integer ssid;

    private Integer ssmeid;

    private Integer ssyourid;

    private String sscourse;

    private String ssdate;

    private String sstitle;

    private String sscontent;

    private String ssphoto;

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public Integer getSsmeid() {
        return ssmeid;
    }

    public void setSsmeid(Integer ssmeid) {
        this.ssmeid = ssmeid;
    }

    public Integer getSsyourid() {
        return ssyourid;
    }

    public void setSsyourid(Integer ssyourid) {
        this.ssyourid = ssyourid;
    }

    public String getSscourse() {
        return sscourse;
    }

    public void setSscourse(String sscourse) {
        this.sscourse = sscourse == null ? null : sscourse.trim();
    }

    public String getSsdate() {
        return ssdate;
    }

    public void setSsdate(String ssdate) {
        this.ssdate = ssdate == null ? null : ssdate.trim();
    }

    public String getSstitle() {
        return sstitle;
    }

    public void setSstitle(String sstitle) {
        this.sstitle = sstitle == null ? null : sstitle.trim();
    }

    public String getSscontent() {
        return sscontent;
    }

    public void setSscontent(String sscontent) {
        this.sscontent = sscontent == null ? null : sscontent.trim();
    }

    public String getSsphoto() {
        return ssphoto;
    }

    public void setSsphoto(String ssphoto) {
        this.ssphoto = ssphoto == null ? null : ssphoto.trim();
    }
}