package exercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author yc
 * @Date 2018/10/28 12:36
 *
 * ����
 * ����һ�����飬����С��K���������������ģ�ܴ��뾫������㷨��
 *
 * ����
 * ��һ�У�N(1<N<=100000)����������ĳ���
 * �ڶ��У�K(<=1000,<N)���������С�����K����
 * �����У�N����������Ϊ�����Ԫ�أ��ո�ֿ�
 *
 * ���
 * ��С�������K����������С�������ո����
 */
public class Exam15_MaxHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        int arr[] = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(ss[i]);
        }

        int[] nums = getMinKNumsByHeap(arr, k);
        Arrays.sort(nums);
        for (int i :
                nums) {
            System.out.print(i+" ");
        }
    }

    public static int[] getMinKNumsByHeap(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            return arr;
        }
        int[] heap = new int[k];
        for (int i = 0; i != k; i++) {
            heapInsert(heap, arr[i], i);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < heap[0]) {
                heap[0] = arr[i];
                heapify(heap, 0, k);
            }
        }
        return heap;
    }
    private static void heapInsert(int[] heap, int value, int index) {
        heap[index] = value;
        while (index != 0) {
            int parent = (index - 1) / 2;
            if (heap[parent] < heap[index]) {
                swap(heap, parent, index);
                index = parent;
            } else {
                break;
            }
        }
    }
    private static void heapify(int[] heap, int index, int heapSize) {
        int left = index * 2 + 1;
        int right = index * 2 + 2;
        int largest = index;
        while (left < heapSize) {
            if (heap[left] > heap[index]) {
                largest = left;
            }
            if (right < heapSize && heap[right] > heap[largest]) {
                largest = right;
            }
            if (largest != index) {
                swap(heap, largest, index);
            } else {
                break;
            }
            index = largest;
            left = index * 2 + 1;
            right = index * 2 + 2;
        }
    }
    private static void swap(int[] heap, int parent, int index) {
        int tmp = heap[index];
        heap[index] = heap[parent];
        heap[parent] = tmp;
    }

}
