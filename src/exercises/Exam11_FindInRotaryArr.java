package exercises;

/*
    描述
输入一个递增排序的数组（元素不重复）的一个旋转（次数不详），找出某个元素.

输入
第一行：N，数组的长度
第二行：N个整数，作为数组的元素，空格分开
第三行：要查找的关键字K

输出
关键字K的下标，如果没有找到，输出-1

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

        int splitIndex = getSplitIndex(arr);	//获取最小元素位置
        //比较待查找元素与第一个元素的大小，如果大于等于第一个元素表明待查找元素在前半段
        if(k>=arr[start]) {
            end = splitIndex-1;
            return binarySearch(arr, k,start,end);
        } else {	//否则在后半段查找
            start = splitIndex;
            return binarySearch(arr,k,start,end);
        }

    }

    //找出旋转数组中的最小元素
    public static int getSplitIndex(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        //考虑到没有旋转这种特殊的旋转
        if(arr[start]<arr[end])
            return start;

        while(start + 1<end) {
            int mid = (start + end) / 2;
            if(arr[mid]>arr[start]) {	//说明左侧有序，则最小元素在右侧
                start = mid;
            }
            if(arr[mid]<arr[end]) {	//说明右侧有序，说明最小元素在左侧
                end = mid;
            }
        }
        //当退出循环时，一定是end位置的元素小与begin位置的元素
        return end;
    }
    //二分查找法
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

