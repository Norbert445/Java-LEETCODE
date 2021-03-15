package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curr1 = headA;
        ListNode curr2 = headB;

        while(curr1 != curr2) {
            if(curr1 == null) {
                curr1 = headB;
            } else {
                curr1 = curr1.next;
            }
            if(curr2 == null) {
                curr2 = headA;
            } else {
                curr2 = curr2.next;
            }
        }

        return curr1;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
