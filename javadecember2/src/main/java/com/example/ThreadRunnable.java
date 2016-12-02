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
                //System.out.println("�߳�"+this.MyThreadName+"  ��" + i + "��ִ�У�");
                if (ticket>0){
                    try {
                        //˯����
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
//        t1.setName("��Ʊ��1��");
//        t1.start();
//        Thread t2=new Thread(myRunnable);
//        t2.setName("��Ʊ��2��");
//        t2.start();



        Ticket t =new Ticket();
        Thread t1 = new Thread(t,"����һ");
        Thread t2 = new Thread(t,"���ڶ�");
        Thread t3 = new Thread(t,"������");
        Thread t4 = new Thread(t,"������");
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
                //System.out.println("�߳�"+this.MyRunnableName+"��" + i + "��ִ�У�");
                if (ticket>0){


//                    try {
//                        //˯����
//                        sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    //System.out.println(this.MyRunnableName+"��Ʊ��ticket"+ticket--);
                }
            }
        }
    }




   static class Ticket implements Runnable{
        private int ticket =400;
        public void run(){
            while(true){
                //ͬ��
                synchronized (new Object()) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    if(ticket<=0)
                        break;
                    System.out.println(Thread.currentThread().getName()+"---����"+ticket--);
                }
            }
        }
    }
}
