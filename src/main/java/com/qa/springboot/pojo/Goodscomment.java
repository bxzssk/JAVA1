package com.qa.springboot.pojo;

import java.util.Date;

public class Goodscomment extends GoodscommentKey {
    private Date gcdate;

    private Integer gctype;

    private String gctext;

    public Date getGcdate() {
        return gcdate;
    }

    public void setGcdate(Date gcdate) {
        this.gcdate = gcdate;
    }

    public Integer getGctype() {
        return gctype;
    }

    public void setGctype(Integer gctype) {
        this.gctype = gctype;
    }

    public String getGctext() {
        return gctext;
    }

    public void setGctext(String gctext) {
        this.gctext = gctext == null ? null : gctext.trim();
    }
}