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
    /*
    * 9.��n����Χ��һȦ��˳���źš��ӵ�һ���˿�ʼ��������1��3��������
    * ������3�����˳�Ȧ�ӣ���������µ���ԭ���ڼ��ŵ���λ��
    * */
public class lianxi9 {
    public static void main(String[] args) {
        //��������
        Scanner scanner=new Scanner(System.in);
        System.out.print("�������ų�һȦ��������");
        //��������
        int sum=scanner.nextInt();

        //boolean����
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
                    System.out.printf("ԭ���ڵ�"+(i+1)+"λ����������\n");
                }
            }
        }
    }
}
