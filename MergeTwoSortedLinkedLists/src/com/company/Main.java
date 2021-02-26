package com.company;

public class Main {

    public static void main(String[] args) {
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while(l1.next != null) {
            if(l1.next.val >= l2.val) {
                ListNode temp = l1.next;
                l1.next = l2;
                l1.next.next = temp;

                l1 = l1.next;
                l2 = l2.next;
            }
            else {
                l1 = l1.next;
            }
        }
        return l1;
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
