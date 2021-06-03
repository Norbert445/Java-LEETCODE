package com.company;

import java.util.ArrayList;
import java.util.List;

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

class MyHashSetOptimized {
    List<List<Integer>> parentList;
    final int BUCKET_SIZE = 100;

    /** Initialize your data structure here. */
    public MyHashSetOptimized() {
        parentList = new ArrayList<>(BUCKET_SIZE);
        for(int i = 0; i < BUCKET_SIZE; i++) {
            parentList.add(null);
        }
    }

    public void add(int key) {
        int index = key % BUCKET_SIZE;
        List<Integer> childList = parentList.get(index);
        if(childList == null) {
            childList = new ArrayList<>();
            childList.add(key);
            parentList.set(index,childList);
        } else {
            if(!childList.contains(key)) {
                childList.add(key);
            }
        }
    }

    public void remove(int key) {
        int index = key % BUCKET_SIZE;
        List<Integer> childList = parentList.get(index);
        if(childList != null) {
            childList.remove(Integer.valueOf(key));
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        int index = key % BUCKET_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
    }
}

