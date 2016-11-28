package com.example;

/**
 * Created by a on 2016/11/26.
 */
/*
*1 作用
*2 范永兴
*3 2016/11/24
*/
public class text {
    static double PI=3.1415;
    static int id;
    static int i=10;

    //定义静态方法
    public static void method(){
        id=i+1000;
        System.out.println(text.PI);//调用静态常量
        System.out.println(text.id);//调用静态变量
    }

    public static void main(String[] args) {
        method();
    }
}
