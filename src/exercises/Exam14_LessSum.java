package exercises;

import java.util.Scanner;

/**
 * @Author yc
 * @Date 2018/10/28 12:17
 *
 * ����
 * ����С�͵Ķ������£�
 *
 * ���磺����s = [1, 3, 5, 2, 4, 6]����s[1]�����С�ڻ����s[1]�����ĺ�Ϊ1����s[2]�����С�ڻ����s[2]������1��3�����Ϊ4��������������λ�õ���߱���С���ߵ��ڵ����ĺ��������������������С�͡�
 *
 * ����һ�����飬��������С�͡�
 *
 * ����
 * ��һ�У�N(1<N<=100000)����������ĳ���
 * �ڶ��У�N������(<=100)����Ϊ�����Ԫ�أ��ո�ֿ�
 *
 * ���
 * �����С��
 */
public class Exam14_LessSum {
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

        System.out.println(smallSum2(arr));//15
    }



    //ʱ�临�Ӷ�O(NlogN)������ռ临�Ӷ�O(N)
    public static int smallSum2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return func(arr, 0, arr.length - 1);//�鲢����
    }

    private static int func(int[] s, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = (l + r) / 2;
        return func(s, l, mid) + func(s, mid + 1, r) + merge(s, l, mid, r);
        //�鲢����Ĺ��̻���в����ٺϲ������������飬�����飬�ϲ�������
    }

    private static int merge(int[] s, int left, int mid, int right) {
        int[] h = new int[right - left + 1];
        int hi = 0;//h����λ
        int i = left;//������λ
        int j = mid + 1;//������λ
        int sum = 0;
        while (i <= mid && j <= right) {
            if (s[i] <= s[j]) {
                sum += s[i] * (right - j + 1);//����С��
                h[hi++] = s[i++];//���鶯
            } else {
                h[hi++] = s[j++];//���鶯
            }
        }
        for (; (j < right + 1) || (i < mid + 1); j++, i++) {
            h[hi++] = i > mid ? s[j] : s[i];//������ϳ�h
        }
        for (int k = 0; k != h.length; k++) {
            s[left++] = h[k];//�ϳ�s
        }
        return sum;
    }
}
