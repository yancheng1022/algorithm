package exercises;


/*

描述
输出水仙花数。 所谓"水仙花数"是指一个N位数，其各位上的数字的N次方和等于该数本身。例如：153是一个3位的"水仙花数"，因为153=1^3+5^3+3^3

输入
一个整数N代表位数。 (2 < N < 6)

输出
所有N位的水仙花数，数之间以一个空格作为分隔。


*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exam02_NarcissisticNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        result = getNarcissisticNumber(N);
        for (Integer i :result) {
            System.out.print(i+" ");
        }
    }

    public static List<Integer> getNarcissisticNumber(int N){
        List<Integer> results = new ArrayList<>();
        int min = (int) Math.pow(10, N-1);
        int max = min*10;
        for (int i = min;i < max;i++){
            int result = 0;
            int temp = i;
            int j = 0;
            while (j < N){

                result += Math.pow(temp%10,N);
                temp /= 10;
                j++;
            }
            if(result == i){
                results.add(result);
            }
        }
        return results;
    }
}
