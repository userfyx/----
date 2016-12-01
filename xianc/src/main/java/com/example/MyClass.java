package com.example;

public class MyClass {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();
    }
}
    class MyThread1 extends Thread {
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("�߳�1��" + i + "��ִ�У�");
                try {
                    //˯һ���5��
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class MyRunnable implements Runnable {
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("�߳�2��" + i + "��ִ�У�");
                try {
                    //˯һ���3��
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
