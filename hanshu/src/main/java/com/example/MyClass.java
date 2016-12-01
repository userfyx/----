package com.example;

public class MyClass {
    /*
        * 明确函数定义的格式
        修饰符返回值类型函数名(参数类型形式参数1，参数类型形式参数2，)
        {   执行语句;
          return 返回值;
        }
        当函数运算后，没有具体的返回值时，这是返回值类型用一个特殊的关键字来标识
该关键字就是void    void:代表的是函数没有具体返回值的情况
当函数的返回值类型是void时，函数中的return语句可以省略不写*/
    public static void getResult(int num)
    {
        System.out.println(num * 3 + 5);
        return;//可以省略
    }
    //mian
    public static void main(String[] args){
        /*
        *获取不同数据的运算结果 代码出现了重复
        *为了提高代码的复用性 对代码进行抽取 将这个部分定义成一个独立的功能
        */
        int x = 4;
        System.out.println(x*3+5);
        x = 6;
        System.out.println(x*3+5);
        int y = 4*3+5;
        int z = 6*3+5;
        System.out.println(y);
        System.out.println(z);

        //
        int i=5;
        getResult(i);


        draw(5,6);
        printHr();
        draw(7,9);
        printHr();
//        print99();
        //重载
        add(4,5);
        add(4,5,6);
        print99();

    }


    //打印矩形
    public static void draw(int row,int col){
        for(int x=0; x<row; x++){
            for(int y=0; y<col; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //分隔线
    public static void printHr(){
        System.out.println("------------------------------");
    }
    /*
    定义一个打印99乘法表功能的函数。
    */
//    public static void print99(){
//        for(int x=1; x<=9; x++){
//            for(int y=1; y<=x; y++){
//                System.out.print(y+"*"+x+"="+y*x+"\t");
//            }
//            System.out.println();
//        }
//    }



    //函数重载打印99乘法表
    public static void print99(int num)
    {
        for(int x=1; x<=num; x++)
        {
            for(int y=1; y<=x; y++)
            {
                System.out.print(y+"*"+x+"="+y*x+"\t");
            }
            System.out.println();
        }
    }
    //打印99乘法表
    public static void print99()
    {
        print99(9);
    }
    //定义一个加法运算，获取两个整数的和。
    public static int add(int x,int y)
    {
        return x+y;
    }
    //定义一个加法，获取三个整数的和。
    public static int add(int x,int y,int z)
    {
        return add(x,y)+z;
    }


}
