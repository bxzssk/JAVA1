package com.qa.springboot.pojo;

public class Areainfo {
    private Integer aid;

    private String aname;

    private Integer alevel;

    private Integer aparentid;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public Integer getAlevel() {
        return alevel;
    }

    public void setAlevel(Integer alevel) {
        this.alevel = alevel;
    }

    public Integer getAparentid() {
        return aparentid;
    }

    public void setAparentid(Integer aparentid) {
        this.aparentid = aparentid;
    }
}