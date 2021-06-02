package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MyHashSet {

    boolean[] hashSet;

    /** Initialize your data structure here. */
    public MyHashSet() {
        hashSet = new boolean[1000001];
    }

    public void add(int key) {
        hashSet[key] = true;
    }

    public void remove(int key) {
        hashSet[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return hashSet[key];
    }
}
