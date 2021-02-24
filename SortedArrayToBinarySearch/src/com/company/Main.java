package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        return constructBST(nums, 0, nums.length - 1);
    }

    public TreeNode constructBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;
        TreeNode currentNode = new TreeNode(nums[mid]);
        currentNode.left = constructBST(nums, left, mid - 1);
        currentNode.right = constructBST(nums, mid + 1, right);
        return currentNode;
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
    }
}
