package com.company;
import com.company.LinkedList;
import jdk.jshell.Snippet;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.Node(1);
        LinkedList.Node second = new LinkedList.Node(2);
        LinkedList.Node third = new LinkedList.Node(3);

        list.head.next = second;
        second.next = third;

        System.out.println(list.elementAtPosition(1));
    }

}
