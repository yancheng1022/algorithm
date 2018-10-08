package sort;

/*
    冒泡排序：对相邻的元素进行两两比较，如果前一个比后一个大，则交换位置，这样每一趟就会冒出一个最大的
    分类： 内部比较排序
    最差时间复杂度：O（n^2） 最好时间复杂度： O（n）（对于本来就有序的序列 ，需要在下面的基础上加标志位）

*/
public class Bubble {
    public static void main(String[] args) {
        int a[] = {1,5,9,3,7,0};
        sort(a);
        for (int i :a) {
            System.out.print(i+" ");
        }

    }

    public static void sort(int a[]){
        int len = a.length;
        for (int i = 0;i<len;i++){
            for (int j=0;j<len-i-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
}
