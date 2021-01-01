package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public ListNode removeElements(ListNode head,int val) {
        if(head == null) {
            return null;
        }

        ListNode curr = new ListNode(-1);
        curr.next = head;
        head = curr;

        while(curr.next != null) {
            if(curr.next.val == val) {
                curr.next = curr.next.next;
            }
            else {
                curr = curr.next;
            }
        }
        return head.next;
    }
}
