package com.company;

public class LinkedList {
    private Node first;
    private Node last;
    private int size = 0;

    public LinkedList(){
        last = new Node(0,first,null);
        first = new Node(0,null,last);
    }

    public void addFirst(int value){
        Node next = first;
        next.setValue(value);
        first = new Node(0,null,next);
        next.setPrevElement(first);
        size++;
    }
    public void addLast(int value){
         Node prev = last;
         prev.setValue(value);
         last = new Node(0,prev,null);
         prev.setNextElement(last);
         size++;
    }
    public int get(int index){
        Node temp = first.getNextElement();
        for (int i = 0; i < index; i++) {
            temp = temp.getNextElement();
        }
        return temp.getValue();
    }
    public int size(){
        return size;
    }

    private class Node {
        private Node nextElement;
        private Node prevElement;
        private int value;

        Node(int value, Node prevElement, Node nextElement){
            this.value = value;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
        public Node getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node nextElement) {
            this.nextElement = nextElement;
        }

        public Node getPrevElement() {
            return last;
        }

        public void setPrevElement(Node prevElement) {
            this.prevElement = prevElement;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
