package exercises;


/*

���������1-N֮�����е�������

����
һ������N�� (2 <= N <= 10000)

���
1-N֮�����е���������N��Ϊ�˱��ڹ۲������ڿ���̨��ÿ�����5�����������������֮����һ���ո���Ϊ�ָ���

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
 * �����ܽ᣺
 * ��1��isPrime �ŵ�for���������޷�����ÿ��ѭ���ĳ�ʼֵ��true�ģ�������Ҫ����ѭ���ڲ�
 * ��2��ÿ�����5��������i % 5������i % 4,��Ϊ�ǵ�����ε�ʱ����
 *
 */