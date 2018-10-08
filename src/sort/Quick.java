package sort;


/*
    快速排序： 分区+排序递归
    时间复杂度：n2 nlogn nlogn
    不稳定：因为基准值与比他小的序列后的第一个值（可能与基准值相等） 产生不稳定性

*/
public class Quick {
    public static void main(String[] args) {
        int a[] = {1,5,9,3,7,0};
        sort(a,0,a.length-1);
        for (int i :a) {
            System.out.print(i+" ");
        }
    }

    public static void sort(int[]a,int left,int right){
        if (left >= right)return;
        int pivot = partition(a, left, right);
        sort(a, left,pivot-1);
        sort(a, pivot+1, right);

    }

    //分区
    public static int partition(int a[],int left,int right){
        int pivot = a[right];
        int tail = left-1;
        for (int i=left;i<right;i++){
            if (a[i] <= pivot){
                swap(a, ++tail, i);
            }
        }
        swap(a,tail+1,right);
        return tail+1;

    }

    //交换
    public static void swap(int A[], int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
