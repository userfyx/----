package com.example;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 ����
*2 ������
*3 2016/11/24
*/
    /*
    * 8.�����ַ������Ӵ����ֵĴ���
    * */
public class lianxi8 {
    
    public static void main(String[] args) {

        String str = "dfghjfyxskdfgbfyxjsdfhfyxbgsdjuvfyxyghfyxxcbvdjfyxkhsgfsfyxdhjbvfyxnbcvfyxbdjngd";
        String str1 = "fyx";
        int count = 0;
        int start = 0;
        //
        while (str.indexOf(str1, start) >= 0 && start < str.length()) {
            count++;

            start = str.indexOf(str1, start) + str1.length();
        }
        System.out.println(str1 + "��" + str + "���ֵĴ���Ϊ" + count);
    }
}
