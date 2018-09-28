package exercises;
    /*
        ����
        һ����������������������֣�������ͬ��֮�⣬���������ֶ����������Ρ���д�����ҳ�������ֻ����һ�ε����֡�Ҫ��ʱ�临�Ӷ���O(n)���ռ临�Ӷ���O(1)��

        ����
        ��һ�У�����ĳ���N(1<n<100000)
        �ڶ��У�N���������ո����

        ���
        ֻ������1�ε�����������С����ǰ����ں󣬿ո����
    */


import java.util.Scanner;

public class Exam07_TwoSingleNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int result = 0;
        for (int i=0;i<N;i++){
            a[i] = sc.nextInt();
            result ^= a[i];
        }
        int num1[] = new int [1];
        int num2[] = new int [1];
        Exam07_TwoSingleNumbers obj = new Exam07_TwoSingleNumbers();
        obj.FindNumsAppearOnce(a,num1,num2);
        if (num1[0]<num2[0]){
            System.out.print(num1[0]+" "+num2[0]);
        }else {
            System.out.print(num2[0]+" "+num1[0]);
        }


    }



    public void FindNumsAppearOnce(int[] array, int[] num1, int[] num2)    {
        int length = array.length;
        if(length == 2){
            num1[0] = array[0];
            num2[0] = array[1];
            return;
        }
        int bitResult = 0;
        for(int i = 0; i < length; ++i){
            bitResult ^= array[i];
        }
        int index = findFirst1(bitResult);
        for(int i = 0; i < length; ++i){
            if(isBit1(array[i], index)){
                num1[0] ^= array[i];
            }else{
                num2[0] ^= array[i];
            }
        }
    }

    private int findFirst1(int bitResult){
        int index = 0;
        while(((bitResult & 1) == 0) && index < 32){
            bitResult >>= 1;
            index++;
        }
        return index;
    }

    private boolean isBit1(int target, int index){
        return ((target >> index) & 1) == 1;
    }
}
/*


���ȣ�λ�������������ʣ�������ͬ�������=0��һ������0�����������

��ֻ��һ��������һ��ʱ�����ǰ����������е���������������㣬���ʣ�µľ����䵥��������Ϊ�ɶԶ����ֵĶ������ˡ�

�������˼·���������������������Ǽ�����AB������һ�ε����顣�������Ȼ��������ʣ�µ����ֿ϶���A��B���Ľ����
�������Ķ������е�1�����ֵ���A��B�Ĳ�ͬ��λ�����Ǿ�ȡ��һ��1���ڵ�λ���������ǵ�3λ�����Ű�ԭ����ֳ����飬
�����׼�ǵ�3λ�Ƿ�Ϊ1����ˣ���ͬ�����϶���һ���飬��Ϊ��ͬ��������λ����ͬ������ͬ�������϶�����һ�顣
Ȼ����������鰴���ʼ��˼·���������ʣ��������������������ֻ����һ�ε����֡�

*/