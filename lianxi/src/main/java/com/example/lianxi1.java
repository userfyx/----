package com.example;

import java.io.File;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 ����
*2 ������
*3 2016/11/24
*/
/*
1.������һ���ļ����µ������ļ�����չʾ���㼶��ϵ���ļ���������ʾ�������һ����ʽд���ı���
        Ҫ�󣺾����ܼ򵥡��߼�����
        ��ѡ�洢��ʽ�ṹҲ�ܿ����㼶��ϵ�����ɶ�д��ֱ��ʹ��*/

public class lianxi1 {


    //private static ArrayList<String> filelist = new ArrayList<String>();


    public static void main(String[] args) throws Exception {
        //·��
        String filePath = "D://";
        //
        getFiles(filePath);
    }
    /*
     * ͨ���ݹ�õ�ĳһ·�������е�Ŀ¼�����ļ�
     */
    static void getFiles(String filePath){
        File root = new File(filePath);
        //�����ļ�
        File[] files = root.listFiles();
        //����
        for(File file:files){
            //�ж��Ƿ��ļ���
            if(file.isDirectory()){
      /*
       * �ݹ����
       */       //�����ļ��е�·��
                //getFiles(file.getAbsolutePath());
                //��ӵ�����
               // filelist.add(file.getAbsolutePath());

                System.out.println("��ʾ"+filePath+"��������Ŀ¼�����ļ�"+file.getAbsolutePath());
            }else{

                System.out.println("��ʾ"+filePath+"��������Ŀ¼"+file.getAbsolutePath());
            }
        }
    }
}
