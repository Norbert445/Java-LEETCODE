package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public String interpret(String command) {
        StringBuilder res = new StringBuilder();

        for(int i = 0; i < command.length(); i++) {
            if(command.charAt(i) == 'G') {
                res.append('G');
            } else if(command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                res.append('o');
                i++;
            } else {
                res.append("al");
                i+=3;
            }
        }

        return res.toString();
    }
}
