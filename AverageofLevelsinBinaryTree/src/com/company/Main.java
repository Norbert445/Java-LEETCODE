package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public List<Double> averageOfLevelsDFS(TreeNode root) {
        List<Integer> count = new ArrayList<>();
        List<Double> sum = new ArrayList<>();
        List<Double> res = new ArrayList<>();

        dfs(root,0,count,sum);

        for(int i = 0; i < sum.size(); i++) {
            res.add(sum.get(i) / count.get(i));
        }
        return res;
    }

    public void dfs(TreeNode node, int i, List<Integer> count, List<Double> sum) {
        if(node == null) return;

        if(i < sum.size()) {
            sum.set(i,sum.get(i) + node.val);
            count.set(i,count.get(i) + 1);
        } else {
            sum.add((double)node.val);
            count.add(1);
        }

        dfs(node.left,i + 1,count,sum);
        dfs(node.right,i+1,count,sum);
    }


    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Double> res = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            double sum = 0;
            int count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while(!queue.isEmpty()) {
                TreeNode node = queue.remove();
                sum += node.val;
                count++;
                if(node.left != null) {
                    temp.add(node.left);
                }
                if(node.right != null) {
                    temp.add(node.right);
                }
            }
            res.add(sum / (double)count);
            queue = temp;
        }
        return res;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
