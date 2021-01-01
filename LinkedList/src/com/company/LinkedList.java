package com.company;

public class LinkedList {

    Node head;

     static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("The previous node cannot be null");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        Node last = head;
        while(last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public void deleteNode(int key) {
        Node temp = head,prev = null;

        if(temp != null && temp.data == key) {
            head = temp.next;
        }

        while(temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if(temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public void deleteNodeAtPosition(int position) {
        if(head == null) {
            return;
        }

        Node temp = head;

        if(position == 0) {
            head = temp.next;
            return;
        }

        for(int i=0;temp!= null && i<position-1;i++) {
            temp = temp.next;
        }

        //if position is more than number of nodes
        if(temp == null || temp.next == null) {
            return;
        }

        Node next = temp.next.next;
        temp.next = next;
    }

    public void deleteList() {
        head = null;
    }

    public int length() {
        Node n = head;
        int count = 0;
        while(n != null) {
            n = n.next;
            count++;
        }
        return count;
    }

    public int length(Node node) {
        if(node == null) return 0;
        return 1 + length(node.next);
    }

    public boolean search(Node node,int x) {
        Node curr = head;
        while(curr != null) {
            if(curr.data == x) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public int elementAtPosition(int i) {
        Node curr = head;
        int count = 0;

        while(curr != null) {
            if(count == i){
                return curr.data;
            }
            curr = curr.next;
            count++;
        }
        return 0;
    }
}
