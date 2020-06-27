package com.mengxi.manageemp.domain;

import java.util.List;

public class locationNode {
    private int id;
    private String label;
    private List<locationNode> children;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<locationNode> getChildren() {
        return children;
    }

    public void setChildren(List<locationNode> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "locationNode{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", children=" + children +
                '}';
    }
}
