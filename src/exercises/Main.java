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
                //���map���Ѿ�����ȱ����һ�������� �Ǿͷ��ؽ�������û�У�
                //�ǾͰѱ�numbers[i], i ��������
                result[0] = map.get(target - numbers[i]) ;//target - numbers[i]���ȷŽ�map��
                result[1] = i ;//����ֵ�±��1��ʼ
                break;
            }else{
                map.put(numbers[i],i);
            }
        }
        return result;
    }
}