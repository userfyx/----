package com.example;

/**
 * Created by a on 2016/12/1.
 */

public class ThredRunnable {
    static class MyThread extends Thread{
        private String name;
        public MyThread(String name) {
            super();
            this.name = name;
        }
        public void run(){
            for(int i=0;i<10;i++){
                System.out.println("线程开始："+this.name+",i="+i);
            }
        }
    }
    public static void main(String[] args) {
        //顺序打印先A后B
        MyThread mt1=new MyThread("线程A");
        MyThread mt2=new MyThread("线程B");
        mt1.run();
        mt2.run();

        //
        MyThread1 mt=new MyThread1();
        new Thread(mt).start();//同一个mt，但是在Thread中就不可以，如果用同一
        new Thread(mt).start();//个实例化对象mt，就会出现异常
        new Thread(mt).start();

    }
    //能够可以实现资源共享
    static class MyThread1 implements Runnable{
        private int ticket=10;
        public void run(){
            for(int i=0;i<20;i++){
                if(this.ticket>0){
                    System.out.println("卖票：ticket"+this.ticket--);
                }
            }
        }
    }


}
