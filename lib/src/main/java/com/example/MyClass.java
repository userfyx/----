package com.example;

public class MyClass {
    //变量
    int i=1;
    //静态变量
    static int c=2;
    //常量
    final int a=3;
    //静态常量
    final static int b=4;
    static final int d=4;
        //静态方法中可以调用非静态的值  new这个类  类点这个非静态的值或方法
        static void  aa(){
        MyClass me=new MyClass();
        int i = me.i;
    }

    static void My(MyClass d){
        d.NonStaticMethod();
    }

    public static void main(String[] args) {

        //System.out.println("a"+a);
        //System.out.println("i"+i);-->   i使用静态或写在方法中类中
        c+=1;
        System.out.println("c2------"+c);//静态可以使用

        //b+=1;--------->
        //d+=1;--------->b,d在final有的情况下不能使用
        System.out.println("b-------"+b);
        System.out.println("d-------"+d);
        //for提示fori 按tab键快捷键
//        for (int i = 0; i < ; i++) {
//
//        }
        //sout快捷键
//        System.out.println();

        MyClass sObj=new MyClass();
        My(sObj);
        StaticMethod(sObj);  //在主函数中可以直接调用静态方法
        sObj.NonStaticMethod();  //在主函数中可以直接调用非静态方法
    }
/////////////////////////////
    void NonStaticMethod(){
        System.out.println("This is a non-sataic method.");
    }

    static void StaticMethod(MyClass s){
        System.out.println("This is a static method.");
        s.NonStaticMethod();//在主函数中可以直接调用非静态方法
    }

       public static void main2(String[] args) {
        MyClass sObj=new MyClass();
        StaticMethod(sObj);  //在主函数中可以直接调用静态方法
    }







}
