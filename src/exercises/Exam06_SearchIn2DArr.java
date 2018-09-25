package exercises;

import java.util.Scanner;

/*

描述
二维数组中的查找。在一个二维数组中，每一行都按照从左到右递增的顺序排列，每一列都按照从上到下递增的顺序排列。输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

输入
第一行：二维数组的行数M

第二行：二维数组的列数N

第三行：要查找的数x

接下来的M行：每一行都有N个整数，空格隔开

输出
如果x在数组中，输出true，否则输出false


*/
public class Exam06_SearchIn2DArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();
        int array[][] = new int[M][N];
        for(int i = 0;i<M;i++){
            String temp[] = sc.nextLine().split(" ");
            for (int j = 0;j<N;j++){
                array[i][j] = Integer.parseInt(temp[j]);
            }
        }

        boolean exit = searchNumber(array,X);
        System.out.print(exit);
    }


    public static boolean searchNumber(int a[][],int number){
        int len = 0;
        int high = a[0].length -1;

        while (len < a.length && high > 1){
            if(a[len][high] > number){
                high--;
            }else if(a[len][high] < number){
                len++;
            }else {
                return true;
            }
        }
        return false;
    }
}
