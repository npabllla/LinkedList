package com.company.LinkedList;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
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
    public void clear(){
        for(Node<T> currentNode = first; currentNode!=null;){
            Node<T> nextNode = currentNode.getNextElement();
            currentNode.setValue(null);
            currentNode.setPrevElement(null);
            currentNode.setNextElement(last);
            currentNode=nextNode;
        }
        size = 0;
    }
    public int size(){
        return size;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<size;
            }

            @Override
            public T next() {
                return get(index++);
            }
        };
    }
    public Iterator<T> descendingIterator(){
        return new Iterator<T>() {
            int index = size-1;
            @Override
            public boolean hasNext() {
                return index>=0;
            }

            @Override
            public T next() {
                return get(index--);
            }
        };
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
