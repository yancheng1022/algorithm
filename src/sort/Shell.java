package sort;

/*
    希尔排序：
    分类：比较排序
    时间复杂度： n2  n  n1.3
    稳定性：不稳定

*/

public class Shell {
    public static void main(String[] args) {
        int a[] = {1,5,9,3,7,0};
        sort(a);
        for (int i :a) {
            System.out.print(i+" ");
        }
    }

    public static void sort(int a[]){
        int N = a.length;
        for (int d = N/2;d >0 ;d/=2){
            for (int i = d;i < N;i++){
                for (int j = i;j >= d&&a[j]<a[j-d];j-=d){
                    int t = a[j];
                    a[j] = a[j-d];
                    a[j-d] = t;
                }
            }
        }
    }
}
