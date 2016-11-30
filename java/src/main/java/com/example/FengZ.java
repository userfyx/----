package com.example;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 作用
*2 范永兴
*3 2016/11/24
*/
public class FengZ {
    public static void main(String[] args) {
        //封装
        Person person=new Person();
        person.setAge(21);
        person.setName("范永兴");
        String s = person.toString();
        System.out.printf(s);

        Husband husband = new Husband();
        husband.age = 30;
        husband.name = "张三";
        husband.sex = "男";
        husband.wife.age=30;
        husband.wife.name="张红";
        husband.wife.name="女";
    }
}
