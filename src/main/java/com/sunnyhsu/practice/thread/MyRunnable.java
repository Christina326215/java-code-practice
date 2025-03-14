package com.sunnyhsu.practice.thread;

public class MyRunnable implements Runnable {

    // 實作 Runnable，再將它交給 Thread 執行
    @Override
    public void run() {
        System.out.println("Runnable is running in: " + Thread.currentThread().getName());
    }
}
