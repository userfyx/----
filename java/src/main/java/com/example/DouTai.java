package com.example;

/**
 * Created by a on 2016/11/30.
 */
/*
*1 作用
*2 范永兴
*3 2016/11/24
*/
public class DouTai {
    public static void main(String[] args) {




        function(new Cat());
        function(new Dog());

        Animal a = new Cat();//向上转型
        a.eat();

        Cat c = (Cat)a;//向下转型
        c.catchMouse();

    }

    public static void function(Animal a)
    {
        a.eat();
        //用于子类型有限
        //或判断所属类型进而使用其特有方法
        if(a instanceof Cat)
        {
            Cat c = (Cat)a;
            c.catchMouse();
        }
        else if(a instanceof Dog)
        {
            Dog c = (Dog)a;
            c.kanJia();
        }
    }
}
