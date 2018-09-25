package exercises;

import java.util.Scanner;

/*

����
��ά�����еĲ��ҡ���һ����ά�����У�ÿһ�ж����մ����ҵ�����˳�����У�ÿһ�ж����մ��ϵ��µ�����˳�����С�����������һ����ά�����һ���������ж��������Ƿ��и�������

����
��һ�У���ά���������M

�ڶ��У���ά���������N

�����У�Ҫ���ҵ���x

��������M�У�ÿһ�ж���N���������ո����

���
���x�������У����true���������false


*/
public class Exam06_SearchIn2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();
        int array[][] = new int[M][N];
        for(int i = 0;i<M;i++){
            String temp[] = sc.nextLine().split(" ");
            for (int j = 0;j<N;j++){
                array[i][j] = Integer.parseInt(temp[j]);
            }
        }

        boolean exit = searchNumber(array,X);
        System.out.print(exit);
    }


    public static boolean searchNumber(int a[][],int number){
        int len = 0;
        int high = a[0].length -1;

        while (len < a.length && high > 1){
            if(a[len][high] > number){
                high--;
            }else if(a[len][high] < number){
                len++;
            }else {
                return true;
            }
        }
        return false;
    }
}
