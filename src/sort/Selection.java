package sort;
/*
    ѡ������
    ���ѡ������
    ʱ�临�Ӷȣ� n2 n2 n2
    �ȶ��ԣ����ȶ�


*/
public class Selection {
    public static void main(String[] args) {
        int a[] = {1,5,9,3,7,0};
        sort(a);
        for (int i :a) {
            System.out.print(i+" ");
        }
    }
    public static void sort(int a[]){
        int N = a.length;
        for (int i = 0;i < N;i++){
            int min = i;
            for (int j = i+1;j<N;j++){
                if (a[j]<a[j-1])min = j;
            }
            int t = a[min];
            a[min] = a[i];
            a[i] = t;
        }

    }
}
