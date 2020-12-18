package com.qa.springboot.pojo;

public class Keywordinfo {
    private Integer kwid;

    private String kwtext;

    public Integer getKwid() {
        return kwid;
    }

    public void setKwid(Integer kwid) {
        this.kwid = kwid;
    }

    public String getKwtext() {
        return kwtext;
    }

    public void setKwtext(String kwtext) {
        this.kwtext = kwtext == null ? null : kwtext.trim();
    }
}