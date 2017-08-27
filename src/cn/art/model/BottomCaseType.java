package cn.art.model;

public class BottomCaseType {
    private Integer bctid;

    private String bctname;

    private Integer tid;

    public Integer getBctid() {
        return bctid;
    }

    public void setBctid(Integer bctid) {
        this.bctid = bctid;
    }

    public String getBctname() {
        return bctname;
    }

    public void setBctname(String bctname) {
        this.bctname = bctname == null ? null : bctname.trim();
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}