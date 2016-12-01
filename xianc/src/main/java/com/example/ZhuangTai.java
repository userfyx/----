package com.example;

/**
 * Created by a on 2016/12/1.
 */
/*
*1 作用
*2 范永兴
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
// 很耗时的操作，用来减慢线程的执行
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
// 一个计数器，计数到100，在每个数字之间暂停1秒，每隔10个数字输出一个字符串
    static class MyThread1 extends Thread {

        public void run() {
            for (int i = 0; i < 100; i++) {
                if ((i) % 10 == 0) {
                    System.out.println("-------" + i);
                }
                System.out.print(i);
                try {
                    Thread.sleep(1);
                    System.out.print("    线程睡眠1毫秒！\n");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}