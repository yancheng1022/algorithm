package exercises;

import java.util.Scanner;

/*
    描述
小明刚刚看完电影《第K级台阶》，离开电影院的时候，他数了数礼堂前的台阶数，恰好是K级!

站在台阶前，他突然又想着一个问题：

如果我每一步只能迈上1个或2个台阶。先迈左脚，然后左右交替，最后一步是迈右脚，

也就是说一共要走偶数步。那么，上完K级台阶，有多少种不同的上法呢？

请你利用计算机的优势，帮助小明寻找答案。

输入
一个整数K（10<=K<=20）

输出
整数，走法的种数

*/
public class Exam10_TheKthStep {


    static int sum = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        f(a,0);
        System.out.println(sum);
    }

    public static void f(int n,int step){
        if (n < 0)return;
        if(n ==0){
            if (step %2 ==0)sum++;
            return;
        }

        f(n-1,step+1);
        f(n-2,step+1);
    }


}
