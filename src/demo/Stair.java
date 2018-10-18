package demo;

import java.util.Scanner;


/*
    小白上楼梯：一次可以走一阶，二阶，三阶  。n阶台阶可以多少次走完？
*/
public class Stair {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int res = f(a);
        System.out.println(res);
    }

    public static int f(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        if(n==2)return 2;
        return f(n-1)+f(n-2)+f(n-3);
    }
}
