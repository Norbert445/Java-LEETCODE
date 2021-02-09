package com.company;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list = inOrderDFS(root,list);
        for(int i = 0; i < list.size()-1; i++) {
            if(list.get(i) >= list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public List<Integer> inOrderDFS(TreeNode node,List<Integer> list) {
        if(node.left != null) {
            inOrderDFS(node.left,list);
        }
        list.add(node.val);
        if(node.right != null) {
            inOrderDFS(node.right,list);
        }

        return list;
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
