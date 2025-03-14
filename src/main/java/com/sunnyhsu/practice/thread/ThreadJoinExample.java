package com.sunnyhsu.practice.thread;

public class ThreadJoinExample {
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " :start");
                for(int i = 0; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
                System.out.println(Thread.currentThread().getName() + " :end");
            }
        }, "Thread-a");

        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " :start");
                try {
                    a.join(); // Thread-b暫停直到Thread-a執行結束才會繼續執行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i = 0; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
                System.out.println(Thread.currentThread().getName() + " :end");
            }
        }, "Thread-b");

        Thread c = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " :start");
                for(int i = 0; i <= 5; i++){
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
                System.out.println(Thread.currentThread().getName() + " :end");
            }
        }, "Thread-c");

        a.start();
        b.start();
        c.start();
    }
}

// 執行結果:
//Thread-b :start
//Thread-a :start
//Thread-c :start
//Thread-a: 0
//Thread-c: 0
//Thread-a: 1
//Thread-c: 1
//Thread-a: 2
//Thread-c: 2
//Thread-a: 3
//Thread-c: 3
//Thread-a: 4
//Thread-c: 4
//Thread-a: 5
//Thread-c: 5
//Thread-a :end
//Thread-c :end
//Thread-b: 0
//Thread-b: 1
//Thread-b: 2
//Thread-b: 3
//Thread-b: 4
//Thread-b: 5
//Thread-b :end

// 參考網址:
// https://matthung0807.blogspot.com/2017/10/java-threadjoin.html
