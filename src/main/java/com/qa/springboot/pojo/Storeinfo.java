package com.qa.springboot.pojo;

public class Storeinfo {
    private Integer stid;

    private String stname;

    private String stnum;

    private String staddress;

    private Integer stareaid;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname == null ? null : stname.trim();
    }

    public String getStnum() {
        return stnum;
    }

    public void setStnum(String stnum) {
        this.stnum = stnum == null ? null : stnum.trim();
    }

    public String getStaddress() {
        return staddress;
    }

    public void setStaddress(String staddress) {
        this.staddress = staddress == null ? null : staddress.trim();
    }

    public Integer getStareaid() {
        return stareaid;
    }

    public void setStareaid(Integer stareaid) {
        this.stareaid = stareaid;
    }
}