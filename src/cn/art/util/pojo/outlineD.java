package cn.art.util.pojo;

public class outlineD {
	private Integer oid;

    private Integer otid;
    private String oname;

    private Integer tid;

    private String odescription;

    private String odata;

    private String ofile;

    private String oimg;

    private String oimg1;

    private String oimg2;

    private String oimg3;

    private String oimg4;

    public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getOtid() {
        return otid;
    }

    public void setOtid(Integer otid) {
        this.otid = otid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getOdescription() {
        return odescription;
    }

    public void setOdescription(String odescription) {
        this.odescription = odescription == null ? null : odescription.trim();
    }

    public String getOdata() {
        return odata;
    }

    public void setOdata(String odata) {
        this.odata = odata == null ? null : odata.trim();
    }

    public String getOfile() {
        return ofile;
    }

    public void setOfile(String ofile) {
        this.ofile = ofile == null ? null : ofile.trim();
    }

    public String getOimg() {
        return oimg;
    }

    public void setOimg(String oimg) {
        this.oimg = oimg == null ? null : oimg.trim();
    }

    public String getOimg1() {
        return oimg1;
    }

    public void setOimg1(String oimg1) {
        this.oimg1 = oimg1 == null ? null : oimg1.trim();
    }

    public String getOimg2() {
        return oimg2;
    }

    public void setOimg2(String oimg2) {
        this.oimg2 = oimg2 == null ? null : oimg2.trim();
    }

    public String getOimg3() {
        return oimg3;
    }

    public void setOimg3(String oimg3) {
        this.oimg3 = oimg3 == null ? null : oimg3.trim();
    }

    public String getOimg4() {
        return oimg4;
    }

    public void setOimg4(String oimg4) {
        this.oimg4 = oimg4 == null ? null : oimg4.trim();
    }

}
