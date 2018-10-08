package sort;
/*
    ������
    ��𣺱Ƚ�����
    ʱ�临�Ӷȣ�nlogn nlogn nlogn
    �ȶ��ԣ����ȶ���������ջ��Ԫ����a[i]������ʱ��

*/
public class Heap {
    //��������
    public static void Swap(int A[], int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    //����
    public static int BuildHeap(int a[]){
        int heap_size = a.length;
        for (int i = heap_size/2-1;i >=0;i--){
            heapify(a,i,heap_size );
        }
        return heap_size;
    }
    //�ѵ���
    public static void heapify(int a[],int i,int size){
        int left_child = 2*i +1;  //��������
        int right_child = 2*i + 2; //�Һ�������
        int max = i;
        if(left_child<size && a[left_child]>a[max]){
            max = left_child;
        }
        if(right_child<size && a[right_child]>a[max]){
            max = right_child;
        }
        if (max != i){
            Swap(a, max, i); //�ѵ�ǰ������������ӽ����л���
            heapify(a, max, size);//�ݹ���ã������ӵ�ǰ������µ�����ע������ָ����
        }
    }
    //������
    public static void sort(int a[]){
        //����һ�����
        int heap_size = BuildHeap(a);
        while (heap_size > 1){ // ����1��ʾδ�������
            //���Ѷ�Ԫ�������һ��Ԫ�ؽ��������Ӷ���ȥ�����һ��Ԫ��
            //�˴��Ľ����ܿ��ܰѺ����Ԫ�ص��ȶ��Դ��ң����Զ��������ȶ�������
            Swap(a, 0, --heap_size);
            //���µĶѶ�Ԫ�ؿ�ʼ���µ�����ʱ�临�Ӷ�o(logn)
            heapify(a, 0, heap_size);
        }
    }

}

