package com.mengxi.manageemp.domain.charts;

public class TypeOverview {
    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TypeOverview{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
