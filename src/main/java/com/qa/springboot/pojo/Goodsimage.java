package com.qa.springboot.pojo;

public class Goodsimage {
    private Integer gimgid;

    private String gimgurl;

    private Integer gdid;

    private Integer gimgtype;

    public Integer getGimgid() {
        return gimgid;
    }

    public void setGimgid(Integer gimgid) {
        this.gimgid = gimgid;
    }

    public String getGimgurl() {
        return gimgurl;
    }

    public void setGimgurl(String gimgurl) {
        this.gimgurl = gimgurl == null ? null : gimgurl.trim();
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getGimgtype() {
        return gimgtype;
    }

    public void setGimgtype(Integer gimgtype) {
        this.gimgtype = gimgtype;
    }
}