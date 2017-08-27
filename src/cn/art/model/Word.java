package cn.art.model;

public class Word {
	private Integer wid;

	private String wword;

	private String wbasic;

	private String wdetail;

	private String wsimilar;

	private String woposite;

	private Integer wcolorwarm;

	private String wfirstchar;

	private String wvocatype;

	public Integer getWid() {
		return wid;
	}

	public void setWid(Integer wid) {
		this.wid = wid;
	}

	public String getWword() {
		return wword;
	}

	public void setWword(String wword) {
		this.wword = wword == null ? null : wword.trim();
	}

	public String getWbasic() {
		return wbasic;
	}

	public void setWbasic(String wbasic) {
		this.wbasic = wbasic == null ? null : wbasic.trim();
	}

	public String getWdetail() {
		return wdetail;
	}

	public void setWdetail(String wdetail) {
		this.wdetail = wdetail == null ? null : wdetail.trim();
	}

	public String getWsimilar() {
		return wsimilar;
	}

	public void setWsimilar(String wsimilar) {
		this.wsimilar = wsimilar == null ? null : wsimilar.trim();
	}

	public String getWoposite() {
		return woposite;
	}

	public void setWoposite(String woposite) {
		this.woposite = woposite == null ? null : woposite.trim();
	}

	public Integer getWcolorwarm() {
		return wcolorwarm;
	}

	public void setWcolorwarm(Integer wcolorwarm) {
		this.wcolorwarm = wcolorwarm;
	}

	public String getWfirstchar() {
		return wfirstchar;
	}

	public void setWfirstchar(String wfirstchar) {
		this.wfirstchar = wfirstchar == null ? null : wfirstchar.trim();
	}

	public String getWvocatype() {
		return wvocatype;
	}

	public void setWvocatype(String wvocatype) {
		this.wvocatype = wvocatype == null ? null : wvocatype.trim();
	}
}