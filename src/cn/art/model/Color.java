package cn.art.model;

public class Color {
	private Integer cid;

    private Integer cbid;

    private Integer tid;

    private String cdescription;

    private String crgb;

    private String cnum;

    private String cfile;

    private String cimg;

    private String cimg1;

    private String cimg2;

    private String cimg3;

    private String cimg4;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCbid() {
        return cbid;
    }

    public void setCbid(Integer cbid) {
        this.cbid = cbid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getCdescription() {
        return cdescription;
    }

    public void setCdescription(String cdescription) {
        this.cdescription = cdescription == null ? null : cdescription.trim();
    }

    public String getCrgb() {
        return crgb;
    }

    public void setCrgb(String crgb) {
        this.crgb = crgb == null ? null : crgb.trim();
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum == null ? null : cnum.trim();
    }

    public String getCfile() {
        return cfile;
    }

    public void setCfile(String cfile) {
        this.cfile = cfile == null ? null : cfile.trim();
    }

    public String getCimg() {
        return cimg;
    }

    public void setCimg(String cimg) {
        this.cimg = cimg == null ? null : cimg.trim();
    }

    public String getCimg1() {
        return cimg1;
    }

    public void setCimg1(String cimg1) {
        this.cimg1 = cimg1 == null ? null : cimg1.trim();
    }

    public String getCimg2() {
        return cimg2;
    }

    public void setCimg2(String cimg2) {
        this.cimg2 = cimg2 == null ? null : cimg2.trim();
    }

    public String getCimg3() {
        return cimg3;
    }

    public void setCimg3(String cimg3) {
        this.cimg3 = cimg3 == null ? null : cimg3.trim();
    }

    public String getCimg4() {
        return cimg4;
    }

    public void setCimg4(String cimg4) {
        this.cimg4 = cimg4 == null ? null : cimg4.trim();
    }
}