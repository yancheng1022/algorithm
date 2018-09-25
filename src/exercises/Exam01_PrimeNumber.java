package exercises;


/*

描述：输出1-N之间所有的素数。

输入
一个整数N。 (2 <= N <= 10000)

输出
1-N之间所有的素数，含N，为了便于观察结果，在控制台里每行输出5个数，并且这五个数之间以一个空格作为分隔。

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Exam01_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> result = getPrime(N);

        int j = 0;
        for (int i=0;i<result.size();i++){
           if(i % 5 == 0 && i > 0){
               System.out.println();
           }
           System.out.print(result.get(i)+" ");
        }

    }

    public static List<Integer> getPrime(int N){

        List<Integer> result = new ArrayList<>();
        for(int i = 2;i < N;i++){
            boolean isPrime = true;
            for(int j = 2;j < i;j++){
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                result.add(i);
            }
        }
        return result;
    }
}

 /*
 *
 * 经验总结：
 * （1）isPrime 放到for的外面是无法控制每次循环的初始值是true的，所以需要放在循环内部
 * （2）每行输出5个数，是i % 5而不是i % 4,因为是到第五次的时候换行
 *
 */