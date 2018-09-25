package exercises;

/*
����
��������һ����������������֮�͵��ڸ���������6=1+2+3����С��������

��ΧN���ڵ�ȫ����ȫ��

����
һ������N����Χ�� (100 <= N < 10000)

���
��С�������1~N����N��֮���ȫ�����������Կո������


*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Exam04_PerfectNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List result = getPerfectNumber(N);
        for (Object i :result) {
            System.out.print(i+" ");
        }

    }

    public static List<Integer> getPerfectNumber(int N){
        List<Integer> results = new ArrayList<>();
        for(int i = 2;i <= N;i++){
            int result = 1;
            for(int j =2;j<i;j++){
                if(i > j && i%j == 0){
                    result += j;
                }
            }
            if(result == i){
                results.add(i);
            }

        }
        return results;
    }
}
