package com.mengxi.manageemp.domain.charts;

public class TypeOverview {
    private String name;
    private String values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "TypeOverview{" +
                "name='" + name + '\'' +
                ", values='" + values + '\'' +
                '}';
    }
}
