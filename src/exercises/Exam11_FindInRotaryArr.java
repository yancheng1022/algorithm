package exercises;

/*
    ����
����һ��������������飨Ԫ�ز��ظ�����һ����ת���������꣩���ҳ�ĳ��Ԫ��.

����
��һ�У�N������ĳ���
�ڶ��У�N����������Ϊ�����Ԫ�أ��ո�ֿ�
�����У�Ҫ���ҵĹؼ���K

���
�ؼ���K���±꣬���û���ҵ������-1

*/


import java.util.Scanner;

public class Exam11_FindInRotaryArr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N;i++)
            arr[i] = in.nextInt();
        int k = in.nextInt();
        System.out.println(FindNum(arr,k));
    }


    public static int FindNum(int arr[],int k) {
        int start = 0;
        int end = arr.length-1;

        int splitIndex = getSplitIndex(arr);	//��ȡ��СԪ��λ��
        //�Ƚϴ�����Ԫ�����һ��Ԫ�صĴ�С��������ڵ��ڵ�һ��Ԫ�ر���������Ԫ����ǰ���
        if(k>=arr[start]) {
            end = splitIndex-1;
            return binarySearch(arr, k,start,end);
        } else {	//�����ں��β���
            start = splitIndex;
            return binarySearch(arr,k,start,end);
        }

    }

    //�ҳ���ת�����е���СԪ��
    public static int getSplitIndex(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        //���ǵ�û����ת�����������ת
        if(arr[start]<arr[end])
            return start;

        while(start + 1<end) {
            int mid = (start + end) / 2;
            if(arr[mid]>arr[start]) {	//˵�������������СԪ�����Ҳ�
                start = mid;
            }
            if(arr[mid]<arr[end]) {	//˵���Ҳ�����˵����СԪ�������
                end = mid;
            }
        }
        //���˳�ѭ��ʱ��һ����endλ�õ�Ԫ��С��beginλ�õ�Ԫ��
        return end;
    }
    //���ֲ��ҷ�
    public static int binarySearch(int[] arr,int target,int start,int end) {
        int low = start;
        int high = end;
        while(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid] == target)
                return mid;
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid -1;
        }
        return -1;
    }
}

