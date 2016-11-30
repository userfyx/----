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
    * 9.有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
    * 凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
    * */
public class lianxi9 {
    public static void main(String[] args) {
        //键盘输入
        Scanner scanner=new Scanner(System.in);
        System.out.print("请输入排成一圈的人数：");
        //接收数据
        int sum=scanner.nextInt();

        //boolean数组
        boolean[] arr=new boolean[sum];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=true;
        }
        int leftCount=sum;
        int countNum=0;
        int index=0;
        while(leftCount>1){
            if (arr[index]==true){
                countNum++;
                if (countNum==3){
                    countNum=0;
                    arr[index]=false;
                    leftCount--;
                }
            }
            index++;
            if (index==sum){
                index=0;
            }
            for (int i = 0; i < sum; i++) {
                if (arr[i]==true){
                    System.out.printf("原排在第"+(i+1)+"位的人留下了\n");
                }
            }
        }
    }
}
