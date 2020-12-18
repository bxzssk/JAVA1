package com.qa.springboot.pojo;

public class Cart {
    private Integer ctid;

    private Integer gdid;

    private Integer gdcount;

    private Integer userid;

    private Integer gsid;

    private Integer stid;

    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getGdcount() {
        return gdcount;
    }

    public void setGdcount(Integer gdcount) {
        this.gdcount = gdcount;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGsid() {
        return gsid;
    }

    public void setGsid(Integer gsid) {
        this.gsid = gsid;
    }

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

	@Override
	public String toString() {
		return "Cart [ctid=" + ctid + ", gdid=" + gdid + ", gdcount=" + gdcount + ", userid=" + userid + ", gsid="
				+ gsid + ", stid=" + stid + "]";
	}
    
    
}