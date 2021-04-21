package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for(Character c : moves.toCharArray()) {
            if(c == 'R') {
                x++;
            } else if(c == 'L') {
                x--;
            } else if(c == 'D') {
                y--;
            } else if(c == 'U') {
                y++;
            }
        }
        return (y == 0 && x == 0);
    }
}
