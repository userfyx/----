package com.example;

public class MyClass {

    static class MyThread extends Thread{
        private String MyThreadname;
        public MyThread(String myThread) {
            this.MyThreadname=myThread;
        }
        @Override
        public void run() {
            System.out.println(this.MyThreadname+"¿ªÆô");
            super.run();
        }
    }
    static class MyRunnable implements Runnable{
        private String MyRunnablename;
        public MyRunnable(String myRunnable) {
            this.MyRunnablename=myRunnable;
        }

        @Override
        public void run() {
            System.out.println(this.MyRunnablename+"¿ªÆô");
        }
    }
    public static void main(String[] args) {

      new MyThread("MyThread").start();
      new MyRunnable("MyRunnable").run();
    }
}
