package com.lyw.leetcode.multi.thread.pid1114;

class Foo {
    private boolean isFirstPrinted;
    private boolean isSecondPrinted;

    public Foo() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        isFirstPrinted = true;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (!isFirstPrinted) {
            Thread.yield();
        }
        if (!isSecondPrinted) {
            // printSecond.run() outputs "second". Do not change or remove this line.
            printSecond.run();
            isSecondPrinted = true;
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (!isSecondPrinted) {
            Thread.yield();
        }

        printThird.run();
    }
}