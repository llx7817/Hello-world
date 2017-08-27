package cn.art.model;

public class Part {
    private Integer pid;

    private Integer pbid;

    private Integer tid;

    private String pdescription;

    private String pfile;

    private String pimg;

    private String pimg1;

    private String pimg2;

    private String pimg3;

    private String pimg4;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

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

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        this.pdescription = pdescription == null ? null : pdescription.trim();
    }

    public String getPfile() {
        return pfile;
    }

    public void setPfile(String pfile) {
        this.pfile = pfile == null ? null : pfile.trim();
    }

    public String getPimg() {
        return pimg;
    }

    public void setPimg(String pimg) {
        this.pimg = pimg == null ? null : pimg.trim();
    }

    public String getPimg1() {
        return pimg1;
    }

    public void setPimg1(String pimg1) {
        this.pimg1 = pimg1 == null ? null : pimg1.trim();
    }

    public String getPimg2() {
        return pimg2;
    }

    public void setPimg2(String pimg2) {
        this.pimg2 = pimg2 == null ? null : pimg2.trim();
    }

    public String getPimg3() {
        return pimg3;
    }

    public void setPimg3(String pimg3) {
        this.pimg3 = pimg3 == null ? null : pimg3.trim();
    }

    public String getPimg4() {
        return pimg4;
    }

    public void setPimg4(String pimg4) {
        this.pimg4 = pimg4 == null ? null : pimg4.trim();
    }
}