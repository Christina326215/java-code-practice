package com.sunnyhsu.practice.thread;

// 繼承 Thread 類別
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running in: " + Thread.currentThread().getName());
    }
}
