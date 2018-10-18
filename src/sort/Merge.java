package sort;

/*
    �鲢����

*/
public class Merge {


    public static void sort(int a[]){
        int[] temp = new int[a.length];
        sort(a,0,a.length-1,temp);

    }

    private static void sort(int[] a, int left, int right, int[] temp) {
        if(left < right){
            int mid = (left+right)/2;
            sort(a, left, mid, temp);
            sort(a,mid+1,right,temp);
            merge(a,left,mid,right,temp);
        }
    }

    private static void merge(int[] a, int left, int mid, int right,int[]temp) {
        int i = left;//������ָ��
        int j = mid+1;//������ָ��
        int t = 0;//��ʱ����ָ��

        while (i<=mid && j <=right){
            if (a[i]<a[j]){
                temp[t++] = a[i++];
            }else {
                temp[t++] = a[j++];
            }
        }
        while (i<=mid){
            temp[t++] = a[i++];
        }
        while (j<=right){
            temp[t++] = a[j++];
        }
        //�����������ԭ����
        t = 0;
        while (left <= right){
            a[left++] = temp[t++];
        }
    }

    public static void main(String[] args) {
        int a[] = {5,8,9,3,7,1,6,3};
        sort(a);
        for (Integer i : a) {
            System.out.print(i+" ");
        }
    }
}
