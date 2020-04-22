package com.company.LinkedList;

public class LinkedList<T>  {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    public LinkedList(){
        last = new Node<T>(null,first,null);
        first = new Node<T>(null,null,last);
    }

    public void addFirst(T value){
        Node<T> next = first;
        next.setValue(value);
        first = new Node<T>(null,null,next);
        next.setPrevElement(first);
        size++;
    }
    public void addLast(T value){
         Node<T> prev = last;
         prev.setValue(value);
         last = new Node<T>(null,prev,null);
         prev.setNextElement(last);
         size++;
    }
    public T get(int index){
        Node<T> temp = first.getNextElement();
        for (int i = 0; i < index; i++) {
            temp = temp.getNextElement();
        }
        return temp.getValue();
    }
    public int size(){
        return size;
    }

    private class Node<T> {
        private Node<T> nextElement;
        private Node<T> prevElement;
        private T value;

        Node(T value, Node<T> prevElement, Node<T> nextElement){
            this.value = value;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }
        public Node<T> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<T> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<T> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<T> prevElement) {
            this.prevElement = prevElement;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }
}
