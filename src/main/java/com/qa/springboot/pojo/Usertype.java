package com.qa.springboot.pojo;

public class Usertype {
    private Integer utid;

    private String utname;

    public Integer getUtid() {
        return utid;
    }

    public void setUtid(Integer utid) {
        this.utid = utid;
    }

    public String getUtname() {
        return utname;
    }

    public void setUtname(String utname) {
        this.utname = utname == null ? null : utname.trim();
    }
}