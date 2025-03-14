package com.sunnyhsu.practice.thread;

public class RunnableExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        // Runnable 只有一個抽象方法 (run())，可視為 Functional Interface，可直接使用 Lambda 寫法
//        Thread t = new Thread(() -> {
//            System.out.println("Lambda Runnable running in: " + Thread.currentThread().getName());
//        });
        thread.start();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}

// Main thread: main
//Runnable is running in: Thread-0