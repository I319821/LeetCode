package com.lyw.leetcode.multi.thread.pid1114;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Foo foo = new Foo();
        Thread t1 = new Thread(new PrintFirst());
        Thread t2 = new Thread(new PrintSecond());
        Thread t3 = new Thread(new PrintThird());



    }


}

class PrintFirst implements Runnable {

    @Override
    public void run() {
        System.out.print("first");
    }
}

class PrintSecond implements Runnable {

    @Override
    public void run() {
        System.out.print("second");
    }
}

class PrintThird implements Runnable {


    @Override
    public void run() {
        System.out.print("third");
    }
}
