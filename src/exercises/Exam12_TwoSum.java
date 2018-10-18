package exercises;

import java.util.HashMap;
import java.util.Scanner;

/**
 * ������һ���������飬�ҵ�������ʹ�����ǵĺ͵���һ���������� target��
 * ����Ҫ��������������±�, ���ҵ�һ���±�С�ڵڶ����±ꡣ
 * ע�������±�ķ�Χ�� 0 �� n-1������Լ��������������
 * ����O(N)ʱ������ɡ�
 *
 *˼�룺����HashMap����������Ԫ��ֵ(�����Key)���±�(�����value)�γ�ӳ��
 *	Ȼ�����һ������arr���ڱ�������������HashMap��containsKey����������ж�Map���Ƿ���target-arr[i]���Ԫ�أ�
 *	���У������ֵ(value)j�ó�����֮ǰres(������Ϊ����֮ǰ�����������±�)���Ƚϣ�����С���������res������
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
        //���뵽map�У�����arr�е�Ԫ��ֵ����key���±�����ֵvalue
        for(int i = 0; i < arr.length; i++)
            map.put(arr[i], i);

        for(int i = 0; i < arr.length; i++) {
            //��map�д���target-arr[i]���������˵������
            if(map.containsKey(target - arr[i])) {
                int j = map.get(target-arr[i]);
                //�ж��ĸ������������������ǰ���������ǰ������
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
