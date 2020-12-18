package com.qa.springboot.pojo;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;


public class Userinfo {
    private Integer userid;

    private String name;

    private Integer sex;
    
    @Past(message="生日只能为过去时间")
    private Date birthday;

    private String ufnum;
    
    private Date logdate;

    private String address;

    private String header;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getUfnum() {
        return ufnum;
    }

    public void setUfnum(String ufnum) {
        this.ufnum = ufnum == null ? null : ufnum.trim();
    }

    public Date getLogdate() {
        return logdate;
    }

    public void setLogdate(Date logdate) {
        this.logdate = logdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header == null ? null : header.trim();
    }
}