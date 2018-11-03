package demo.thisAndSupper;

import java.sql.SQLOutput;

public class B extends A{
    B(){
        this("a");
        System.out.println("B的构造函数");

    }
    B(String name){
        System.out.println("B的带参构造函数");
    }

    public static void main(String[] args) {
        int i;

        new B();
    }
}
