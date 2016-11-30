package com.example;

import java.util.Scanner;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 作用
*2 范永兴
*3 2016/11/24
*/
    /*
    *6.5位数中找出所有，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
    * */
public class lianxi6 {

    //没怎么看懂
    static int[] a = new int[5];
    static int[] b = new int[5];
    public static void main(String[] args) {
        boolean is = false;
        Scanner s = new Scanner(System.in);
        long l = s.nextLong();
        if (l > 99999 || l < 10000) {
            System.out.println("错了再来一次");
            l = s.nextLong();
        }
        for (int i = 4; i >= 0; i--) {
            a[i] = (int) (l / (long) Math.pow(10, i));
            l = (l % (long) Math.pow(10, i));
        }
        System.out.println();
        for (int i = 0, j = 0; i < 5; i++, j++) {
            b[j] = a[i];
        }
        //对比数的两边是否一样
        for (int i = 0, j = 4; i < 5; i++, j--) {
            if (a[i] != b[j]) {
                is = false;
                break;
            } else {
                is = true;
            }
        }
        if (is == false) {
            System.out.println("这个不是回文数！");
        } else if (is == true) {
            System.out.println("这个就是回文数！");
        }
    }


}
