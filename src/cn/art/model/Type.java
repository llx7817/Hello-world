package cn.art.model;

import java.io.Serializable;

public class Type implements Serializable {
	// public class Type {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2142848055135538666L;

	private Integer tid;

	private String tname;

	private Integer talgorithm;

	private Integer twordtype;

	private String tyuyi;

	private String tanli;

	private String tbianma;

	private String tzaoxing;

	private String tcanshu;

	private String tshengcheng;

	private String ttiaozheng;

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

	public String getTanli() {
		return tanli;
	}

	public void setTanli(String tanli) {
		this.tanli = tanli == null ? null : tanli.trim();
	}

	public String getTbianma() {
		return tbianma;
	}

	public void setTbianma(String tbianma) {
		this.tbianma = tbianma == null ? null : tbianma.trim();
	}

	public String getTzaoxing() {
		return tzaoxing;
	}

	public void setTzaoxing(String tzaoxing) {
		this.tzaoxing = tzaoxing == null ? null : tzaoxing.trim();
	}

	public String getTcanshu() {
		return tcanshu;
	}

	public void setTcanshu(String tcanshu) {
		this.tcanshu = tcanshu == null ? null : tcanshu.trim();
	}

	public String getTshengcheng() {
		return tshengcheng;
	}

	public void setTshengcheng(String tshengcheng) {
		this.tshengcheng = tshengcheng == null ? null : tshengcheng.trim();
	}

	public String getTtiaozheng() {
		return ttiaozheng;
	}

	public void setTtiaozheng(String ttiaozheng) {
		this.ttiaozheng = ttiaozheng == null ? null : ttiaozheng.trim();
	}

	public String getTicon() {
		return ticon;
	}

	public void setTicon(String ticon) {
		this.ticon = ticon == null ? null : ticon.trim();
	}
}