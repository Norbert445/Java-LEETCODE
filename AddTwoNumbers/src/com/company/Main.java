package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode l3 = dummyHead;

        int l1_val;
        int l2_val;
        int carry = 0;
        int last_digit;
        int current_sum;

        while(l1 != null || l2 != null) {
            l1_val = l1 != null ? l1.val : 0;
            l2_val = l2 != null ? l2.val : 0;

            current_sum = l1_val + l2_val + carry;
            carry = current_sum / 10;
            last_digit = current_sum % 10;
            l3.next = new ListNode(last_digit);

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;

            l3 = l3.next;
        }

        if(carry > 0) {
            l3.next = new ListNode(carry);
        }

        return dummyHead.next;
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
