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
    *4.有1,2,3,4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
    * */
public class lianxi4 {

    public static void main(String[] args) {
            int c=0;
        //三位数的三个数各不相同的数的次数
        for (int i = 0; i < 5; i++) {
//                if(i==0){
//
//            }else{
                    for (int j = 0; j < 5; j++) {
                        for (int k = 0; k < 5; k++) {
                            if (i!= j &&j!= k&&i!=k) {
                                c++;
                                int sum=i*100+j*10+k;
                                System.out.println("共有" + c + "个三位数"+i+j+k);
                                //会有一点儿小问题就是没有将一位数为0考虑进去
                            }
                        }
                    }
                }

        //}

    }
}
