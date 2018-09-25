package exercises;

/*

����
������������������A��B������A��ĩ�����㹻�Ļ���ռ�����B����дһ����������B�ϲ���A������

����
��һ�У�A����ĳ���

�ڶ��У�A������ЧԪ�صĸ���

�����У�A�����Ԫ�أ�ϵ�д�С������������ո����

�����У�B����ĳ���

�����У�B������ЧԪ�صĸ���

�����У�B�����Ԫ�أ�ϵ�д�С������������ո����

���
��С����ϲ���A�������ЧԪ�أ��ո������


*/

import java.util.ArrayList;
import java.util.Scanner;

public class Exam05_MergeOrderedArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aLengh = sc.nextInt();
        int aNumber = sc.nextInt();
        sc.nextLine();
        String aTemp = sc.nextLine();
        int a[] = parseToIntArray(aTemp.split(" "), aNumber,aLengh);

        int bLengh = sc.nextInt();
        int bNumber = sc.nextInt();
        sc.nextLine();
        String bTemp = sc.nextLine();
        int b[] = parseToIntArray(bTemp.split(" "), bNumber,bLengh);

        int result[] = mergeNumber(a,b,aNumber,bNumber);
        for (int i = 0;i<aNumber+bNumber;i++){
            System.out.print(result[i]+" ");
        }

    }

    public static int[] parseToIntArray(String a[],int length,int arrayLength){
        int results[] = new int[arrayLength];
        for (int i = 0;i<length;i++){
            results[i] = Integer.parseInt(a[i]);
        }
        return results;
    }

    public static int[] mergeNumber(int[]a,int b[],int aLength,int bLength){
        int i=0;
        int j = 0;
        int t = 0;
        int temp[] = new int[a.length + b.length];
        while (i < aLength && j < bLength){
            if(a[i] < b[j]){
                temp[t++] = a[i++];
            }else{
                temp[t++] = b[j++];
            }
        }

        while(i < aLength){
            temp[t++] = a[i++];
        }

        while (j < bLength){
            temp[t++] = b[j++];
        }

        t = 0;
        return temp;
    }

}
