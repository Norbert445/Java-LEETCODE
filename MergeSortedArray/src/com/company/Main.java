package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
       m--;
       n--;
       int k = nums1.length - 1;

       while(k >= 0) {
           if(m < 0) {
               nums1[k] = nums2[n--];
           } else if(n < 0) {
               nums2[k] = nums1[m--];
           } else {
               if(nums1[m] >= nums2[n]) {
                   nums1[k] = nums1[m--];
               } else {
                   nums1[k] = nums2[n--];
               }
           }
           k--;
       }
    }

}
