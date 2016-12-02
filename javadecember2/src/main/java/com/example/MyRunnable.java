package com.example;

/**
 * Created by a on 2016/12/2.
 */

public class MyRunnable {

    static class myRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("开启");
        }
    }
    public static void main(String[] args) {
        //调用run
        new myRunnable().run();

    }
}
