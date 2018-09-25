package exercises;


/*

����
���ˮ�ɻ����� ��ν"ˮ�ɻ���"��ָһ��Nλ�������λ�ϵ����ֵ�N�η��͵��ڸ����������磺153��һ��3λ��"ˮ�ɻ���"����Ϊ153=1^3+5^3+3^3

����
һ������N����λ���� (2 < N < 6)

���
����Nλ��ˮ�ɻ�������֮����һ���ո���Ϊ�ָ���


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
