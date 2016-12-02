package com.example;

/**
 * Created by a on 2016/12/2.
 */
public class MyThread {

    static class myThread1 extends Thread{
        @Override
        public void run() {
            System.out.println(this.getName()+"¿ªÆô");
            super.run();
        }
    }
    static class myThread2 extends Thread{
        @Override
        public void run() {
            System.out.println(this.getName()+"¿ªÆô");
            super.run();
        }
    }

    public static void main(String[] args) {
            new myThread1().start();
            new myThread2().start();
    }
}
