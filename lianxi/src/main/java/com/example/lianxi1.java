package com.example;

import java.io.File;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 作用
*2 范永兴
*3 2016/11/24
*/
/*
1.遍历出一个文件夹下的所有文件，并展示出层级关系，文件夹优先显示，最后以一定格式写入文本中
        要求：尽可能简单、逻辑清晰
        所选存储格式结构也能看出层级关系，并可读写后直接使用*/

public class lianxi1 {


    //private static ArrayList<String> filelist = new ArrayList<String>();


    public static void main(String[] args) throws Exception {
        //路径
        String filePath = "D://";
        //
        getFiles(filePath);
    }
    /*
     * 通过递归得到某一路径下所有的目录及其文件
     */
    static void getFiles(String filePath){
        File root = new File(filePath);
        //所有文件
        File[] files = root.listFiles();
        //遍历
        for(File file:files){
            //判断是否文件夹
            if(file.isDirectory()){
      /*
       * 递归调用
       */       //所有文件夹的路径
                //getFiles(file.getAbsolutePath());
                //添加到集合
               // filelist.add(file.getAbsolutePath());

                System.out.println("显示"+filePath+"下所有子目录及其文件"+file.getAbsolutePath());
            }else{

                System.out.println("显示"+filePath+"下所有子目录"+file.getAbsolutePath());
            }
        }
    }
}
