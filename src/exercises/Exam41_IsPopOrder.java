package exercises;
import demo.thisAndSupper.B;

import java.util.Scanner;
import java.util.Stack;

/*
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ�Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ�
 * ��������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4��5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С�
 * */

public class Exam41_IsPopOrder{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split(" ");
        String b[] = sc.nextLine().split(" ");
        int N = a.length;
        int [] pushA = parseToIntArray(a, N, N);
        int [] popA = parseToIntArray(b, N, N);
        System.out.println(IsPopOrder(pushA,popA)?"True":"False");
    }

    public static int[] parseToIntArray(String a[],int length,int arrayLength){
        int results[] = new int[arrayLength];
        for (int i = 0;i<length;i++){
            results[i] = Integer.parseInt(a[i]);
        }
        return results;
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA)
    {
        if(pushA.length<=0 || popA.length<=0 )
        {
            return false;
        }
        int j=0;
        Stack<Integer> s1=new Stack<Integer>();
        for(int i=0;i<pushA.length;i++)
        {
            s1.push(pushA[i]);
            if(pushA[i] == popA[j])
            {
                if(j++==popA.length-1)
                {
                    return true;
                }
                s1.pop();
            }
        }
        while(!s1.isEmpty())
        {
            if(s1.pop()!=popA[j++])
            {
                return false;
            }
        }
        return true;
    }
}