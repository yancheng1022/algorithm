package demo;

import java.util.Scanner;


/*
    С����¥�ݣ�һ�ο�����һ�ף����ף�����  ��n��̨�׿��Զ��ٴ����ꣿ
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
