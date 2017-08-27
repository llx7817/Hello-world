package cn.art.model;

public class PartType {
    private Integer pbid;

    private Integer tid;

    private String pbname;

    public Integer getPbid() {
        return pbid;
    }

    public void setPbid(Integer pbid) {
        this.pbid = pbid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getPbname() {
        return pbname;
    }

    public void setPbname(String pbname) {
        this.pbname = pbname == null ? null : pbname.trim();
    }
}