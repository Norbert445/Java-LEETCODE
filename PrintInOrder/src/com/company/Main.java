package com.company;

import java.util.concurrent.CountDownLatch;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Foo {

    CountDownLatch first;
    CountDownLatch second;

    public Foo() {
        first = new CountDownLatch(1);
        second = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        first.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        first.await();
        printSecond.run();
        second.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        second.await();
        printThird.run();
    }
}
