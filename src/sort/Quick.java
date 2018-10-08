package sort;


/*
    �������� ����+����ݹ�
    ʱ�临�Ӷȣ�n2 nlogn nlogn
    ���ȶ�����Ϊ��׼ֵ�����С�����к�ĵ�һ��ֵ���������׼ֵ��ȣ� �������ȶ���

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

    //����
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

    //����
    public static void swap(int A[], int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
