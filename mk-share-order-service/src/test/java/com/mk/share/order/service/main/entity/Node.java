package com.mk.share.order.service.main.entity;

import java.util.List;

/**
 * 节点类
 *
 * @author MonkeyKing
 * @create 2017-11-02 10:17
 */
public class Node {
    private String name;// 节点名称
    private String type;// 节点类型
    private List<Node> childNodes;// 子节点集合
    private Boolean isTop;// 是否是顶级节点
    private Node parent;// 父节点

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Node> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<Node> childNodes) {
        this.childNodes = childNodes;
    }

    public Boolean getTop() {
        return isTop;
    }

    public void setTop(Boolean top) {
        isTop = top;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
