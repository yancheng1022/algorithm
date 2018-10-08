package sort;

/*
    插入排序
    分类：比较排序
    时间复杂度：n2 n n2
    稳定性：稳定


*/

public class Insertion {
    public static void main(String[] args) {
        int a[] = {1,5,9,3,7,0};
        sort(a);
        for (int i :a) {
            System.out.print(i+" ");
        }

    }

    public static void sort(int a[]){
        int N = a.length;
        for (int i = 0;i<N;i++){
            for (int j=i;j>0&&a[j]<a[j-1];j--){
                int t = a[j];
                a[j] = a[j-1];
                a[j-1] = t;
            }
        }
    }


}
