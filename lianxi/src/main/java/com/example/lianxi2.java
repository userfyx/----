package com.example;

import java.util.Scanner;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 ����
*2 ������
*3 2016/11/24
*/
/*2.����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����*/
public class lianxi2 {

    public static void show(){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();


        int letterCount = 0; //Ӣ����ĸ����
        int blankCount = 0;  //�ո����
        int numCount = 0;  //���ָ���
        int otherCount = 0;  //�����ַ�����

        for(int i = 0;i <s.length();i ++){
            char tem = s.charAt(i);

            if((tem > 'A' && tem < 'Z') || (tem > 'a' && tem < 'z'))//Ӣ����ĸ
                letterCount ++;
            else if(tem == ' ')//�ո�
                blankCount ++;
            else if(tem > '0' && tem < '9')//����
                numCount ++;
            else//����
                otherCount ++;
        }

        System.out.println("Ӣ����ĸ����: " + letterCount);
        System.out.println("�ո����: " +blankCount);
        System.out.println("���ָ���: " + numCount);
        System.out.println("�����ַ�����: " + otherCount);
    }

    public static void main(String[] args) {
        lianxi2 ll=new lianxi2();
        ll.show();

    }

}
