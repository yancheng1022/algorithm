package exercises;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author yc
 * @Date 2018/10/28 12:46
 *
 * ����
 * ����һ���ַ������͵�����strs�����ҵ�һ��ƴ��˳��ʹ�ý����е��ַ���ƴ��������ɵĴ��ַ��������п��������ֵ�˳�����ģ������������ַ�����
 *
 * ����
 * ��һ�У�N(1<N<=100)����������ĳ���
 * �ڶ��У�N���ַ�������Ϊ�����Ԫ�أ��ո�ֿ����ַ�������<=10
 *
 * ���
 * �ֵ������Ĵ��ַ���
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
