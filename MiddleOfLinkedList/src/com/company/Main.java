package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        HashMap<Integer,ListNode> map = new HashMap<>();
        int count=0;
        while(head!=null) {
            map.put(count,head);
            count++;
            head = head.next;
        }
        return map.get(count/2);
    }
}
