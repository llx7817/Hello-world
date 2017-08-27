package cn.art.model;

public class Survey {
    private Integer sid;

    private Integer tid;

    private String choosesurvey;

    private String wordsurvey;

    private String wordresult;

    private String connectsurvey;

    private String connectresult;

    private String algorithms;

    private String ratio;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getChoosesurvey() {
        return choosesurvey;
    }

    public void setChoosesurvey(String choosesurvey) {
        this.choosesurvey = choosesurvey == null ? null : choosesurvey.trim();
    }

    public String getWordsurvey() {
        return wordsurvey;
    }

    public void setWordsurvey(String wordsurvey) {
        this.wordsurvey = wordsurvey == null ? null : wordsurvey.trim();
    }

    public String getWordresult() {
        return wordresult;
    }

    public void setWordresult(String wordresult) {
        this.wordresult = wordresult == null ? null : wordresult.trim();
    }

    public String getConnectsurvey() {
        return connectsurvey;
    }

    public void setConnectsurvey(String connectsurvey) {
        this.connectsurvey = connectsurvey == null ? null : connectsurvey.trim();
    }

    public String getConnectresult() {
        return connectresult;
    }

    public void setConnectresult(String connectresult) {
        this.connectresult = connectresult == null ? null : connectresult.trim();
    }

    public String getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(String algorithms) {
        this.algorithms = algorithms == null ? null : algorithms.trim();
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio == null ? null : ratio.trim();
    }
}