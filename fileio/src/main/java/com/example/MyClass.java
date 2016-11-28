package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String[] args) {
        try{
        //file文件地址
        File file=new File("D://file.txt");
        //读取
        //BufferedReader br=new BufferedReader(new FileReader(file));
            BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));
            String reading=null;

        while((reading=br.readLine())!=null){
            //打印
            System.out.printf(reading);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    }

}
