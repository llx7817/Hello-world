package cn.art.util.pojo;

public class textureD {
	private Integer textureid;

    private Integer ttid;
    private String ttname;

    private Integer tid;

    private String tdescription;

    private String tfile;

    private String timg;

    private String timg1;

    private String timg2;

    private String timg3;

    private String timg4;

    public String getTtname() {
		return ttname;
	}

	public void setTtname(String ttname) {
		this.ttname = ttname;
	}

	public Integer getTextureid() {
        return textureid;
    }

    public void setTextureid(Integer textureid) {
        this.textureid = textureid;
    }

    public Integer getTtid() {
        return ttid;
    }

    public void setTtid(Integer ttid) {
        this.ttid = ttid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTdescription() {
        return tdescription;
    }

    public void setTdescription(String tdescription) {
        this.tdescription = tdescription == null ? null : tdescription.trim();
    }

    public String getTfile() {
        return tfile;
    }

    public void setTfile(String tfile) {
        this.tfile = tfile == null ? null : tfile.trim();
    }

    public String getTimg() {
        return timg;
    }

    public void setTimg(String timg) {
        this.timg = timg == null ? null : timg.trim();
    }

    public String getTimg1() {
        return timg1;
    }

    public void setTimg1(String timg1) {
        this.timg1 = timg1 == null ? null : timg1.trim();
    }

    public String getTimg2() {
        return timg2;
    }

    public void setTimg2(String timg2) {
        this.timg2 = timg2 == null ? null : timg2.trim();
    }

    public String getTimg3() {
        return timg3;
    }

    public void setTimg3(String timg3) {
        this.timg3 = timg3 == null ? null : timg3.trim();
    }

    public String getTimg4() {
        return timg4;
    }

    public void setTimg4(String timg4) {
        this.timg4 = timg4 == null ? null : timg4.trim();
    }

}
