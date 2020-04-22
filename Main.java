package com.company.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();
        linkedList.addFirst("a");
        linkedList.addFirst("ab");
        linkedList.addFirst("abc");
        linkedList.addFirst("abcd");
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
        System.out.println("-----------------------------------------");
        linkedList.addLast("a");
        linkedList.addLast("ab");
        linkedList.addLast("abc");
        linkedList.addLast("abcd");
        System.out.println(linkedList.get(4));
        System.out.println(linkedList.get(5));
        System.out.println(linkedList.get(6));
        System.out.println(linkedList.get(7));
        System.out.println("-----------------------------------------");
        System.out.println(linkedList.size());
    }
}
