package com.example;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 作用
*2 范永兴
*3 2016/11/24
*/
    /*
    *
    * */
public class lianxi3 {
    public static void main(String[] args) {
        int b = 1;
        int a = 1;
        int c = 0;
        for (int i = 1; i <= 12; i++) {
            a = b;     //1  0  1   1
            b = c;     //0  1  1   2
            c = a + b; //1  1  2   3
            System.out.println("第"+i+"月兔子总数:" + c + "对");
        }

    }
}
