package cn.art.util.pojo;

public class typeYUYI {

		private Integer tid;
		
		private String tname;

	    private Integer talgorithm;

	    private Integer twordtype;

	    private String tyuyi;

	    private String ticon;

	    public Integer getTid() {
			return tid;
		}

		public void setTid(Integer tid) {
			this.tid = tid;
		}

		public String getTname() {
	        return tname;
	    }

	    public void setTname(String tname) {
	        this.tname = tname == null ? null : tname.trim();
	    }

	    public Integer getTalgorithm() {
	        return talgorithm;
	    }

	    public void setTalgorithm(Integer talgorithm) {
	        this.talgorithm = talgorithm;
	    }

	    public Integer getTwordtype() {
	        return twordtype;
	    }

	    public void setTwordtype(Integer twordtype) {
	        this.twordtype = twordtype;
	    }

	    public String getTyuyi() {
	        return tyuyi;
	    }

	    public void setTyuyi(String tyuyi) {
	        this.tyuyi = tyuyi == null ? null : tyuyi.trim();
	    }

	    public String getTicon() {
	        return ticon;
	    }

	    public void setTicon(String ticon) {
	        this.ticon = ticon == null ? null : ticon.trim();
	    }

}
