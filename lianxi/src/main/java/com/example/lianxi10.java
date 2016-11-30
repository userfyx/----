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
    *10.求100之内的素数 //使用除sqrt(n)的方法求出的素数不包括2和3
    * */
public class lianxi10 {
    public static void main(String args[]){

        for(int i=5;i<=100;i++){
            if(fun(i))
                System.out.println(i);
        }

    }
    public static boolean fun(int i){
        int j;

        for(j=2;j<=(int)Math.sqrt(i);j++)
            if(i%j==0)
                break;
        if(j==(int)Math.sqrt(i)+1)
            return true;
        else
            return false;
    }
}
