package exercises;

/*

描述
给定两个排序后的数组A和B，其中A的末端有足够的缓冲空间容纳B。编写一个方法，将B合并入A并排序

输入
第一行：A数组的长度

第二行：A数组有效元素的个数

第三行：A数组的元素，系列从小到大的整数，空格隔开

第四行：B数组的长度

第五行：B数组有效元素的个数

第六行：B数组的元素，系列从小到大的整数，空格隔开

输出
从小到大合并后A数组的有效元素，空格隔开。


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
