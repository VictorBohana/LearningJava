package com.digitalinnovation;

public class Node<T> {
    private T content;
    private Node<T> refNode = null;

    public Node(T content) {
        this.content = content;
    }

    public Object getObject() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Node getRefNode() {
        return refNode;
    }

    public void setRefNode(Node refNode) {
        this.refNode = refNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "content=" + content +
                '}';
    }
}
