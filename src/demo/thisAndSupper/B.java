package demo.thisAndSupper;

import java.sql.SQLOutput;

public class B extends A{
    B(){
        this("a");
        System.out.println("B�Ĺ��캯��");

    }
    B(String name){
        System.out.println("B�Ĵ��ι��캯��");
    }

    public static void main(String[] args) {
        int i;

        new B();
    }
}
