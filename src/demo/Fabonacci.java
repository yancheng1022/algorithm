package demo;
/*
    求阶乘 打印i-j 数组求和 翻转字符串 ——切蛋糕思维
    斐波那契数列 最大公约数f(m,n)=f(n,m%n) ——划不开？有没有递推公式？有没有等价转换？


*/

/*
    斐波那契额数列：
    F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
*/
public class Fabonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n){
        if(n == 1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
