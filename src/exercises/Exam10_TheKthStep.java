package exercises;

import java.util.Scanner;

/*
    ����
С���ոտ����Ӱ����K��̨�ס����뿪��ӰԺ��ʱ��������������ǰ��̨������ǡ����K��!

վ��̨��ǰ����ͻȻ������һ�����⣺

�����ÿһ��ֻ������1����2��̨�ס�������ţ�Ȼ�����ҽ��棬���һ�������ҽţ�

Ҳ����˵һ��Ҫ��ż��������ô������K��̨�ף��ж����ֲ�ͬ���Ϸ��أ�

�������ü���������ƣ�����С��Ѱ�Ҵ𰸡�

����
һ������K��10<=K<=20��

���
�������߷�������

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
