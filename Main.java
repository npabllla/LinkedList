package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println("-----------------------------------------");
        linkedList.addLast(5);
        linkedList.addLast(4);
        linkedList.addLast(3);
        linkedList.addLast(2);
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.get(6));
        System.out.println(linkedList.get(7));
        System.out.println("-----------------------------------------");
        System.out.println(linkedList.size());
    }
}
