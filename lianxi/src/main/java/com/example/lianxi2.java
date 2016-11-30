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
/*2.输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。*/
public class lianxi2 {

    public static void show(){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();


        int letterCount = 0; //英文字母个数
        int blankCount = 0;  //空格个数
        int numCount = 0;  //数字个数
        int otherCount = 0;  //其他字符个数

        for(int i = 0;i <s.length();i ++){
            char tem = s.charAt(i);

            if((tem > 'A' && tem < 'Z') || (tem > 'a' && tem < 'z'))//英文字母
                letterCount ++;
            else if(tem == ' ')//空格
                blankCount ++;
            else if(tem > '0' && tem < '9')//数字
                numCount ++;
            else//其他
                otherCount ++;
        }

        System.out.println("英文字母个数: " + letterCount);
        System.out.println("空格个数: " +blankCount);
        System.out.println("数字个数: " + numCount);
        System.out.println("其他字符个数: " + otherCount);
    }

    public static void main(String[] args) {
        lianxi2 ll=new lianxi2();
        ll.show();

    }

}
