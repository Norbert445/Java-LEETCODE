package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public int countStudents(int[] students, int[] sandwiches) {
       int zero = 0;
       int one = 0;

       for(int student : students) {
           if(student == 0) {
               zero++;
           } else {
               one++;
           }
       }
       for(int sandwich : sandwiches) {
           if(sandwich == 0) {
               zero--;
           } else {
               one--;
           }
           if(zero < 0 || one < 0) {
               return zero + one + 1;
           }
       }

       return 0;
    }
}
