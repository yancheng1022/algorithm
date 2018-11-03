package exercises;


import java.util.Scanner;

/**
 * @Author yc
 * @Date 2018/10/28 10:30
 *
 * ����
 * ����һ�����������飬������Ե�һ��Ԫ�ؿ�ʼ��ÿ��Ԫ��Ϊ�յ����λ����
 *
 * ����
 * ��һ�У�N(1<N<=1000)����������ĳ���
 * �ڶ��У�N����������Ϊ�����Ԫ�أ��ո�ֿ�
 *
 * ���
 * N���������ո��������һλ�������һ��Ԫ�أ��ڶ�λ��ǰ����Ԫ�ص�����λ������
 *
 */
public class Exam13_Median {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        int arr[] = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(ss[i]);
        }
        Insertion.sort(arr);

        media(arr,N);

    }
    public static void media(int arr[],int N){
        int sum = 0;
        for (int i=0;i<N;i++)
        {
            if(i==0){
                System.out.print(arr[0]+" ");
            }else if(i % 2 == 0){
                System.out.print(arr[i/2]+" ");
            }else {
                System.out.print((arr[i/2]+arr[i/2+1])/2+" ");
            }

        }
    }

}
class Insertion {


    public static void sort(int a[]) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && a[j] < a[j - 1]; j--) {
                int t = a[j];
                a[j] = a[j - 1];
                a[j - 1] = t;
            }
        }
    }
}