package com.mengxi.manageemp.domain;

import java.util.Date;

public class NetworkEquipment {
    private int neid;
    private  String uuid;
    private String mac;
    private String fixed_id;
    private  String name;
    private String tid;
    private String NE_type;
    private String unitType;
    private Date stock_date;
    private String remark;
    private NEstatus NEstatus;
    public int getNeid() {
        return neid;
    }

    public void setNeid(int neid) {
        this.neid = neid;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getFixed_id() {
        return fixed_id;
    }

    public void setFixed_id(String fixed_id) {
        this.fixed_id = fixed_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getNE_type() {
        return NE_type;
    }

    public void setNE_type(String NE_type) {
        this.NE_type = NE_type;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public Date getStock_date() {
        return stock_date;
    }

    public void setStock_date(Date stock_date) {
        this.stock_date = stock_date;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public com.mengxi.manageemp.domain.NEstatus getNEstatus() {
        return NEstatus;
    }

    public void setNEstatus(com.mengxi.manageemp.domain.NEstatus NEstatus) {
        this.NEstatus = NEstatus;
    }

    @Override
    public String toString() {
        return "NetworkEquipment{" +
                "neid=" + neid +
                ", uuid='" + uuid + '\'' +
                ", mac='" + mac + '\'' +
                ", fixed_id='" + fixed_id + '\'' +
                ", name='" + name + '\'' +
                ", tid='" + tid + '\'' +
                ", NE_type='" + NE_type + '\'' +
                ", unitType='" + unitType + '\'' +
                ", stock_date='" + stock_date + '\'' +
                ", remark='" + remark + '\'' +
                ", NEstatus=" + NEstatus +
                '}';
    }
}
