package com.company;

public class Node {
    int key;
    Node left,right;

   public Node(int key) {
       this.key = key;
       this.left = null;
       this.right = null;
   }

   public void printTree(Node node) {
       if(node == null) return;
       printTree(node.right);
       System.out.print(node.key + " ");
       printTree(node.left);
   }
}
