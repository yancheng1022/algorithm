package exercises;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 描述给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 * 你需要输出这两个数的下标, 并且第一个下标小于第二个下标。
 * 注意这里下标的范围是 0 到 n-1。你可以假设数组递增有序。
 * 请在O(N)时间内完成。
 *
 *思想：利用HashMap，将数组中元素值(这个做Key)与下标(这个做value)形成映射
 *	然后遍历一遍数组arr，在遍历过程中利用HashMap的containsKey这个方法，判断Map中是否有target-arr[i]这个元素，
 *	若有，则将其键值(value)j拿出，与之前res(其作用为保存之前满足条件的下标)做比较，将较小的坐标存入res数组中
 */
public class Exam12_TwoSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++)
            arr[i] = in.nextInt();
        int target = in.nextInt();
        int[] sum = new int[2];
        sum = twoSum(arr,target);
        for(int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

    }

    public static int[] twoSum(int[] arr,int target) {
        int[] res = new int[2];
        res[0] = res[1] = arr.length;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        //插入到map中，其中arr中的元素值做键key，下标做键值value
        for(int i = 0; i < arr.length; i++)
            map.put(arr[i], i);

        for(int i = 0; i < arr.length; i++) {
            //若map中存在target-arr[i]这个键，则说明存在
            if(map.containsKey(target - arr[i])) {
                int j = map.get(target-arr[i]);
                //判断哪个满足条件的坐标更靠前，保存更靠前的坐标
                if(i<j && i<res[0]) {
                    res[0] = i;
                    res[1] = j;
                } else if(i > j && j<res[0]){
                    res[0] = j;
                    res[0] = i;
                }
            }
        }
        return res;
    }
}
