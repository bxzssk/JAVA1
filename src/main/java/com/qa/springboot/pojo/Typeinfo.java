package com.qa.springboot.pojo;

public class Typeinfo {
    private Integer tpid;

    private String tpname;

    private Integer tplevel;

    private Integer tpparentid;

    public Integer getTpid() {
        return tpid;
    }

    public void setTpid(Integer tpid) {
        this.tpid = tpid;
    }

    public String getTpname() {
        return tpname;
    }

    public void setTpname(String tpname) {
        this.tpname = tpname == null ? null : tpname.trim();
    }

    public Integer getTplevel() {
        return tplevel;
    }

    public void setTplevel(Integer tplevel) {
        this.tplevel = tplevel;
    }

    public Integer getTpparentid() {
        return tpparentid;
    }

    public void setTpparentid(Integer tpparentid) {
        this.tpparentid = tpparentid;
    }
}