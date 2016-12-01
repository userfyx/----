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
                System.out.println("�߳̿�ʼ��"+this.name+",i="+i);
            }
        }
    }
    public static void main(String[] args) {
        //˳���ӡ��A��B
        MyThread mt1=new MyThread("�߳�A");
        MyThread mt2=new MyThread("�߳�B");
        mt1.run();
        mt2.run();

        //
        MyThread1 mt=new MyThread1();
        new Thread(mt).start();//ͬһ��mt��������Thread�оͲ����ԣ������ͬһ
        new Thread(mt).start();//��ʵ��������mt���ͻ�����쳣
        new Thread(mt).start();

    }
    //�ܹ�����ʵ����Դ����
    static class MyThread1 implements Runnable{
        private int ticket=10;
        public void run(){
            for(int i=0;i<20;i++){
                if(this.ticket>0){
                    System.out.println("��Ʊ��ticket"+this.ticket--);
                }
            }
        }
    }


}
