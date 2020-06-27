package com.mengxi.manageemp.domain;

public class Cabinet {
    private String cid;
    private  String name;
    private int location;
    private int devices_num;
    private int height;
    private  int available_height;
    private String remark;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getDevices_num() {
        return devices_num;
    }

    public void setDevices_num(int devices_num) {
        this.devices_num = devices_num;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAvailable_height() {
        return available_height;
    }

    public void setAvailable_height(int available_height) {
        this.available_height = available_height;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Cabinet{" +
                "cid='" + cid + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", devices_num=" + devices_num +
                ", height=" + height +
                ", available_height=" + available_height +
                ", remark='" + remark + '\'' +
                '}';
    }
}
