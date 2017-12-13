package entity;

public class UserLike {
    private Integer ulid;

    private Integer ulubid;

    private Integer ulbyubid;

    private String ultime;

    public Integer getUlid() {
        return ulid;
    }

    public void setUlid(Integer ulid) {
        this.ulid = ulid;
    }

    public Integer getUlubid() {
        return ulubid;
    }

    public void setUlubid(Integer ulubid) {
        this.ulubid = ulubid;
    }

    public Integer getUlbyubid() {
        return ulbyubid;
    }

    public void setUlbyubid(Integer ulbyubid) {
        this.ulbyubid = ulbyubid;
    }

    public String getUltime() {
        return ultime;
    }

    public void setUltime(String ultime) {
        this.ultime = ultime == null ? null : ultime.trim();
    }
}