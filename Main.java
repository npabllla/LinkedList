package com.company.LinkedList;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList();
        linkedList.addFirst("a");
        linkedList.addFirst("ab");
        linkedList.addFirst("abc");
        linkedList.addFirst("abcd");
        for (String list:linkedList) {
            System.out.println(list);
        }
        System.out.println("Size: "+linkedList.size());
        System.out.println("-----------------------------");
        linkedList.clear();
        System.out.println("Size: "+linkedList.size());
        System.out.println("-----------------------------");
        LinkedList<Integer> linkedListInteger = new LinkedList();
        linkedListInteger.addLast(4);
        linkedListInteger.addLast(3);
        linkedListInteger.addLast(2);
        linkedListInteger.addLast(1);
        Iterator iterator = linkedListInteger.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Size: "+linkedListInteger.size());
        System.out.println("-----------------------------");
        linkedListInteger.clear();
        System.out.println("Size: "+linkedListInteger.size());
        System.out.println("-----------------------------");
    }
}
