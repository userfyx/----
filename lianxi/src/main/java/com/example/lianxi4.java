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
    *4.��1,2,3,4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
    * */
public class lianxi4 {

    public static void main(String[] args) {
            int c=0;
        //��λ����������������ͬ�����Ĵ���
        for (int i = 0; i < 5; i++) {
//                if(i==0){
//
//            }else{
                    for (int j = 0; j < 5; j++) {
                        for (int k = 0; k < 5; k++) {
                            if (i!= j &&j!= k&&i!=k) {
                                c++;
                                int sum=i*100+j*10+k;
                                System.out.println("����" + c + "����λ��"+i+j+k);
                                //����һ���С�������û�н�һλ��Ϊ0���ǽ�ȥ
                            }
                        }
                    }
                }

        //}

    }
}
