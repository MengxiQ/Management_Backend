package com.mengxi.manageemp.domain;

public class NEstatus_type {
    private int status_id;
    private String name;
    private String remark;
    private String show_type;

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getShow_type() {
        return show_type;
    }

    public void setShow_type(String show_type) {
        this.show_type = show_type;
    }

    @Override
    public String toString() {
        return "NEstatus_type{" +
                "status_id=" + status_id +
                ", name='" + name + '\'' +
                ", remark='" + remark + '\'' +
                ", show_type='" + show_type + '\'' +
                '}';
    }
}
