package exercises;

/*
描述
完美数即一个数的所有真因子之和等于该数本身，如6=1+2+3是最小的完美数

求范围N以内的全部完全数

输入
一个整数N代表范围。 (100 <= N < 10000)

输出
从小到大输出1~N（含N）之间的全部完美数，以空格隔开。


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
