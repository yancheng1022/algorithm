package sort;

/*
    ��������
    ���ࣺ�Ƚ�����
    ʱ�临�Ӷȣ�n2 n n2
    �ȶ��ԣ��ȶ�


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
