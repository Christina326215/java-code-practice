package com.sunnyhsu.practice.thread;

public class ThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}

//Thread is running in: Thread-0
//Main thread: main
