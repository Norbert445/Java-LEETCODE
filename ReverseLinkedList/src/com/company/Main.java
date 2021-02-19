package com.company;

public class Main {

    public static void main(String[] args) {

    }


    public ListNode reverseList(ListNode head) {
        ListNode currentNode = head;
        ListNode prev = null;
        ListNode next;

        while(currentNode != null) {
            next = currentNode.next;
            currentNode.next = prev;
            prev = currentNode;
            currentNode = next;
        }

        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
