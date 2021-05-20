package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MyHashMapLinkedList {
    LinkedList<Entry>[] map;
    int size = 769;

    /** Initialize your data structure here. */
    public MyHashMapLinkedList() {
        map = new LinkedList[size];
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int hash = key % size;
        if(map[hash] == null) {
            map[hash] = new LinkedList<>();
            map[hash].add(new Entry(key,value));
        } else {
            for(Entry entry : map[hash]) {
                if(entry.key == key) {
                    entry.val = value;
                    return;
                }
            }
            map[hash].add(new Entry(key,value));
        }
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int hash = key % size;
        if(map[hash] == null) {
            return -1;
        } else {
            for(Entry entry : map[hash]) {
                if(entry.key == key) {
                    return entry.val;
                }
            }
            return -1;
        }
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int hash = key % size;
        if(map[hash] == null) return;
        for(Entry entry : map[hash]) {
            if(entry.key == key) {
                map[hash].remove(entry);
                return;
            }
        }

    }
}

class Entry {
    int key;
    int val;

    public Entry(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

/*class MyHashMap {
    int[] arr;

    public MyHashMap() {
        arr = new int[1000001];
        Arrays.fill(arr,-1);
    }

    public void put(int key, int value) {
        arr[key] = value;
    }

    public int get(int key) {
       return arr[key];
    }

    public void remove(int key) {
        arr[key] = -1;
    }
}*/
