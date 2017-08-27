package cn.art.model;

public class User {
    private Integer uid;

    private String uname;

    private String upassword;

    private Integer uprivilege;

    private String uemail;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Integer getUprivilege() {
        return uprivilege;
    }

    public void setUprivilege(Integer uprivilege) {
        this.uprivilege = uprivilege;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }
}