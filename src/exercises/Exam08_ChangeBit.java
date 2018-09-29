package exercises;



/*
描述
给定两个整数A和B，需要改变几个二进制位才能将A转为B。

输入
1行：A和B，空格隔开

输出
需要改变的位数
*/
import java.util.Scanner;
public class Exam08_ChangeBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a & b;
        int d = a | b;
        int e = c ^ d;
        int count = 0;
        while (e != 0){
            e = (e-1)&e;
            count++;
        }

        System.out.print(count);
    }
}
/*
    可将题目转化为：求两个二进制数中不相同的位数
    设 A = 0010 1011， B = 0110 0101.
    A&B = 0010 0001
    A|B = 0110 1111
    E = A^B = 0100 1110  (1的个数即位两个数中不同的位)

    e与e-1不停的做与运算，做与运算的次数即为1的个数
*/