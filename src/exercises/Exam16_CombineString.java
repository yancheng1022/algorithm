package exercises;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author yc
 * @Date 2018/10/28 12:46
 *
 * 描述
 * 给定一个字符串类型的数组strs，请找到一种拼接顺序，使得将所有的字符串拼接起来组成的大字符串是所有可能性中字典顺序最大的，并输出这个大字符串。
 *
 * 输入
 * 第一行：N(1<N<=100)，代表数组的长度
 * 第二行：N个字符串，作为数组的元素，空格分开，字符串长度<=10
 *
 * 输出
 * 字典序最大的大字符串
 */
public class Exam16_CombineString {
    public static class MyComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return (a + b).compareTo(b + a);
        }
    }

    public static String lowestString(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs, new MyComparator());
        String res = "";
        for (int i = strs.length-1; i >= 0; i--) {
            res += strs[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String a[] = s.split(" ");
        System.out.println(lowestString(a));
    }

}
