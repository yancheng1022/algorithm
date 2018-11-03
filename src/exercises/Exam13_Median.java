package exercises;


import java.util.Scanner;

/**
 * @Author yc
 * @Date 2018/10/28 10:30
 *
 * 描述
 * 给定一个正整数数组，请求出自第一个元素开始到每个元素为终点的中位数。
 *
 * 输入
 * 第一行：N(1<N<=1000)，代表数组的长度
 * 第二行：N个整数，作为数组的元素，空格分开
 *
 * 输出
 * N个整数，空格隔开；第一位是数组第一个元素，第二位是前两个元素的上中位数……
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