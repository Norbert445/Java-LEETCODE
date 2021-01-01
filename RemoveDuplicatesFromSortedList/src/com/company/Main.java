package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode current = head;
            while(current != null) {
                if(current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    }
}
