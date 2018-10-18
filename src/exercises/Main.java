package exercises;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        int array[] = new int[ss.length];
        for (int i=0;i<ss.length;i++){
            array[i] = Integer.parseInt(ss[i]);
        }
        int b = sc.nextInt();
        int[] bb = twoSum(array, b);
        System.out.println(bb[0]+" "+bb[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n = numbers.length;
        int[] result = new int[2];
        for(int i = 0; i < n; i++){
            if(map.containsKey(target - numbers[i])){
                //如果map里已经有所缺的另一个数字了 那就返回结果，如果没有，
                //那就把本numbers[i], i 存入数组
                result[0] = map.get(target - numbers[i]) ;//target - numbers[i]是先放进map的
                result[1] = i ;//返回值下标从1开始
                break;
            }else{
                map.put(numbers[i],i);
            }
        }
        return result;
    }
}