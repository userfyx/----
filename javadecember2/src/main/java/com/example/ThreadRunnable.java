package com.example;

/**
 * Created by a on 2016/12/2.
 */

public class ThreadRunnable {
    static class MyThread extends Thread{
        private int ticket=10;
        private String MyThreadName;
        public MyThread(String myThread) {
            this.MyThreadName=myThread;
        }

        @Override
        public void run() {
            super.run();
            for (int i = 0; i <10 ; i++) {
                //System.out.println("线程"+this.MyThreadName+"  第" + i + "次执行！");
                if (ticket>0){
                    try {
                        //睡五秒
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }
    }
    public static void main(String[] args) {
//        new MyThread("MyThread1").start();
//        new MyThread("MyThread2").start();
//        new MyThread("MyThread3").start();

//        new MyRunnable("MyRunnable1").run();
//        new MyRunnable("MyRunnable2").run();
        MyRunnable myRunnable=new MyRunnable("aaaaa");

//        Thread t1=new Thread(myRunnable);
//        t1.setName("买票口1：");
//        t1.start();
//        Thread t2=new Thread(myRunnable);
//        t2.setName("买票口2：");
//        t2.start();



        Ticket t =new Ticket();
        Thread t1 = new Thread(t,"窗口一");
        Thread t2 = new Thread(t,"窗口二");
        Thread t3 = new Thread(t,"窗口三");
        Thread t4 = new Thread(t,"窗口四");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
    static class MyRunnable implements Runnable{
        private int ticket=10;
        private String MyRunnableName;
        public MyRunnable(String myRunnable) {
            this.MyRunnableName=myRunnable;
        }

        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                //System.out.println("线程"+this.MyRunnableName+"第" + i + "次执行！");
                if (ticket>0){


//                    try {
//                        //睡五秒
//                        sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    //System.out.println(this.MyRunnableName+"卖票：ticket"+ticket--);
                }
            }
        }
    }




   static class Ticket implements Runnable{
        private int ticket =400;
        public void run(){
            while(true){
                //同步
                synchronized (new Object()) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if(ticket<=0)
                        break;
                    System.out.println(Thread.currentThread().getName()+"---卖出"+ticket--);
                }
            }
        }
    }
}
