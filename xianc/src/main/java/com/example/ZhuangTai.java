package com.example;

/**
 * Created by a on 2016/12/1.
 */
/*
*1 ����
*2 ������
*3 2016/11/24
*/
public class ZhuangTai {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread1().start();
    }

    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 5; i++) {
// �ܺ�ʱ�Ĳ��������������̵߳�ִ��
//            for(long k= 0; k <100000000;k++);
                try {
                    Thread.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(this.getName() + " :" + i);
            }
        }
    }
// һ����������������100����ÿ������֮����ͣ1�룬ÿ��10���������һ���ַ���
    static class MyThread1 extends Thread {

        public void run() {
            for (int i = 0; i < 100; i++) {
                if ((i) % 10 == 0) {
                    System.out.println("-------" + i);
                }
                System.out.print(i);
                try {
                    Thread.sleep(1);
                    System.out.print("    �߳�˯��1���룡\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}