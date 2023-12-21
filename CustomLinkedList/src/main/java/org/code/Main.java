package org.code;

import org.code.linkedlist.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(12);
        list.add(23);
        list.add(34);

        System.out.println(list.Find(34)); ;

    }
}