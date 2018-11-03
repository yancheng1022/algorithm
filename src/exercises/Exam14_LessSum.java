package exercises;

import java.util.Scanner;

/**
 * @Author yc
 * @Date 2018/10/28 12:17
 *
 * 描述
 * 数组小和的定义如下：
 *
 * 例如：数组s = [1, 3, 5, 2, 4, 6]，在s[1]的左边小于或等于s[1]的数的和为1，在s[2]的左边小于或等于s[2]的数有1和3，求和为4，……，将所有位置的左边比它小或者等于的数的和相加起来就是真个数组的小和。
 *
 * 给定一个数组，输出数组的小和。
 *
 * 输入
 * 第一行：N(1<N<=100000)，代表数组的长度
 * 第二行：N个整数(<=100)，作为数组的元素，空格分开
 *
 * 输出
 * 数组的小和
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



    //时间复杂度O(NlogN)，额外空间复杂度O(N)
    public static int smallSum2(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        return func(arr, 0, arr.length - 1);//归并排序
    }

    private static int func(int[] s, int l, int r) {
        if (l == r) {
            return 0;
        }
        int mid = (l + r) / 2;
        return func(s, l, mid) + func(s, mid + 1, r) + merge(s, l, mid, r);
        //归并排序的过程会进行拆组再合并，即：拆左组，拆右组，合并左右组
    }

    private static int merge(int[] s, int left, int mid, int right) {
        int[] h = new int[right - left + 1];
        int hi = 0;//h的首位
        int i = left;//左组首位
        int j = mid + 1;//右组首位
        int sum = 0;
        while (i <= mid && j <= right) {
            if (s[i] <= s[j]) {
                sum += s[i] * (right - j + 1);//生成小和
                h[hi++] = s[i++];//左组动
            } else {
                h[hi++] = s[j++];//右组动
            }
        }
        for (; (j < right + 1) || (i < mid + 1); j++, i++) {
            h[hi++] = i > mid ? s[j] : s[i];//左右组合成h
        }
        for (int k = 0; k != h.length; k++) {
            s[left++] = h[k];//合成s
        }
        return sum;
    }
}
