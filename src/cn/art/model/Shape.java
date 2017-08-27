package cn.art.model;

public class Shape {
    private Integer shapeid;

    private Integer stid;

    private String shapedescription;

    private String shapeimg;

    private String shapefile;

    private String shapedata;

    public Integer getShapeid() {
        return shapeid;
    }

    public void setShapeid(Integer shapeid) {
        this.shapeid = shapeid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getShapedescription() {
        return shapedescription;
    }

    public void setShapedescription(String shapedescription) {
        this.shapedescription = shapedescription == null ? null : shapedescription.trim();
    }

    public String getShapeimg() {
        return shapeimg;
    }

    public void setShapeimg(String shapeimg) {
        this.shapeimg = shapeimg == null ? null : shapeimg.trim();
    }

    public String getShapefile() {
        return shapefile;
    }

    public void setShapefile(String shapefile) {
        this.shapefile = shapefile == null ? null : shapefile.trim();
    }

    public String getShapedata() {
        return shapedata;
    }

    public void setShapedata(String shapedata) {
        this.shapedata = shapedata == null ? null : shapedata.trim();
    }
}