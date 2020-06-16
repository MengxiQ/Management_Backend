package com.mengxi.manageemp.domain;

import java.util.Date;

public class NEstatus {
    private int neid;
    private String status_name;
    private Date date;
    private String site;
    private  String remark;

    public int getNeid() {
        return neid;
    }

    public void setNeid(int neid) {
        this.neid = neid;
    }

    public String getStatus_name() {
        return status_name;
    }

    public void setStatus_name(String status_name) {
        this.status_name = status_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "NEstatus{" +
                "neid=" + neid +
                ", status_name='" + status_name + '\'' +
                ", date=" + date +
                ", site='" + site + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
