package entity;

public class PrivateLetter {
    private Integer plid;

    private String plcontent;

    private String pldata;

    private Integer plsendid;

    private Integer placcept;

    public Integer getPlid() {
        return plid;
    }

    public void setPlid(Integer plid) {
        this.plid = plid;
    }

    public String getPlcontent() {
        return plcontent;
    }

    public void setPlcontent(String plcontent) {
        this.plcontent = plcontent == null ? null : plcontent.trim();
    }

    public String getPldata() {
        return pldata;
    }

    public void setPldata(String pldata) {
        this.pldata = pldata == null ? null : pldata.trim();
    }

    public Integer getPlsendid() {
        return plsendid;
    }

    public void setPlsendid(Integer plsendid) {
        this.plsendid = plsendid;
    }

    public Integer getPlaccept() {
        return placcept;
    }

    public void setPlaccept(Integer placcept) {
        this.placcept = placcept;
    }
}