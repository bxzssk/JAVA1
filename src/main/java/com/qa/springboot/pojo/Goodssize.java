package com.qa.springboot.pojo;

public class Goodssize {
    private Integer gsid;

    private String gstext;

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    public String getGstext() {
        return gstext;
    }

    public void setGstext(String gstext) {
        this.gstext = gstext == null ? null : gstext.trim();
    }
}