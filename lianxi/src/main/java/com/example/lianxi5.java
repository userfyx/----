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
5.求1+2!+3!+...+20!的和
*/
public class lianxi5 {

    public static void main(String[] args) {
        int sum=0;
        int num=1;
        for (int i = 1; i <=20; i++) {

            num=num*i;//1!+2!+3!+....
            //sum=sum+num
            sum+=num;
        }
        System.out.printf(sum+"");
    }
}
