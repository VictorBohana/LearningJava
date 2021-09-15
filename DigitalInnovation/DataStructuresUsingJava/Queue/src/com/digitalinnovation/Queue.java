package com.digitalinnovation;

public class Queue<T> {
    Node<T> refLast;

    public Queue(){
    }

    public Queue(Node refLast) {
        this.refLast = refLast;
    }

    public T getFirst(){
        if(!this.isEmpty()){
            Node firstNode = refLast;
            while(refLast.getRefNode() != null){
                firstNode = firstNode.getRefNode();
            }
            return (T) firstNode.getObject();
        }
        return null;
    }

    public void enqueue(T newObj){
        Node newNode = new Node(newObj);
        newNode.setRefNode(refLast);
        refLast = newNode;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            Node firstNode = refLast;
            Node aux = refLast;
            while(firstNode.getRefNode() != null){
                aux = firstNode;
                firstNode = firstNode.getRefNode();
            }
            aux.setRefNode(null);
            return (T) firstNode.getObject();
        }
        return null;
    }

    public boolean isEmpty(){
        return refLast == null ? true : false;
    }

    @Override
    public String toString() {
        String returnedString = "";
        Node aux = refLast;
        if(refLast != null){
            while(aux.getRefNode() != null){
                returnedString += "[Node{content=" + aux.getObject() + "}]--->";
                aux = aux.getRefNode();
            }

            if(aux.getRefNode() == null){
                returnedString += "[Node{content=" + aux.getObject() + "}]--->null";
            }
        }
        else{
            returnedString = "null";
        }
        return returnedString;
    }
}
