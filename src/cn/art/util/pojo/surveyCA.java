package cn.art.util.pojo;

public class surveyCA {

    private Integer tid;

    private String choosesurvey;

    private String algorithms;

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

    public String getAlgorithms() {
        return algorithms;
    }

    public void setAlgorithms(String algorithms) {
        this.algorithms = algorithms == null ? null : algorithms.trim();
    }

}
