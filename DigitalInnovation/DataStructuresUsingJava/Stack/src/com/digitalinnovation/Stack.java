package com.digitalinnovation;

public class Stack {
    Node topNode = null;

    public void push(Node newNode){
        Node aux = topNode;
        topNode = newNode;
        topNode.setRefNode(aux);
    }

    public Node pop(){
        if(!isEmpty()){
            Node poppedNode = topNode;
            topNode = topNode.getRefNode();
            return poppedNode;
        }
        return null;
    }

    public Node top(){
        return topNode;
    }

    public boolean isEmpty(){
        return topNode == null ? true : false;
    }

    @Override
    public String toString() {
        String returnedString = "================\n";
        returnedString += "     STACK     \n";
        returnedString += "================\n";
        Node aux = topNode;
        while(aux != null){
            returnedString += "[Node{value=" + aux.getValue() + "}]\n";
            aux = aux.getRefNode();
        }

        returnedString += "================\n";
        return returnedString;
    }
}
