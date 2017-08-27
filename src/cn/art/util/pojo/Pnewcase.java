package cn.art.util.pojo;

public class Pnewcase {
	private Integer newcaseid;

    private Integer tid;

    private String newcasename;
    
    public Integer getNewcaseid() {
        return newcaseid;
    }

    public void setNewcaseid(Integer newcaseid) {
        this.newcaseid = newcaseid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getNewcasename() {
        return newcasename;
    }

    public void setNewcasename(String newcasename) {
        this.newcasename = newcasename == null ? null : newcasename.trim();
    }

    
}
