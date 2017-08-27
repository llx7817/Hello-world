package cn.art.util.pojo;

public class outlineB {
	private Integer oid;
	private Integer tid;
	private String oname;
	private String odescription;
    private String oimg;
    
    public String getOname() {
		return oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}
    public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOdescription() {
        return odescription;
    }

    public void setOdescription(String odescription) {
        this.odescription = odescription == null ? null : odescription.trim();
    }

    public String getOimg() {
        return oimg;
    }

    public void setOimg(String oimg) {
        this.oimg = oimg == null ? null : oimg.trim();
    }

}
