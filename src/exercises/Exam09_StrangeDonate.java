package exercises;

/*
����
�ز����Q�������յ���Ը�ǣ��ó�100��Ԫ��X�����ľ���齱������ο���������Ρ�
�鷳���ǣ����и�����ֵ�Ҫ��

1. 100��Ԫ���뱻���÷ֳ����ɷݣ�����ʣ�ࣩ��ÿ�ݱ�����7�����ɴη�Ԫ�����磺1Ԫ, 7Ԫ��49Ԫ��343Ԫ��...

2. ��ͬ���ķ������ܳ���5�ݡ�

3. ����������Ҫ�������£��ֳɵķ���Խ��Խ�ã�

�����æ����һ�£������Է�Ϊ���ٷݣ�

����
�̶����룺1000000

���
�����Է�Ϊ���ٷ�

*/

//dfs
public class Exam09_StrangeDonate {
    static int[] mk = new int[100];
    static int num = 0;

    public static void main(String[] args) {
        dfs(0, 0);
    }

    public static void dfs(int i, int count) {
        if (count > 1000000)
            return;
        if (mk[i] > 5)
            return;
        int temp = 1;
        if (i == 0) {
            count += 1;
            temp = 0;
        }
        for (int j = 0; j < i; j++) {
            temp = temp * 7;
        }
        count += temp;
        mk[i] += 1;
        num += 1;
        if (count == 1000000) {
            System.out.println(num);
            return;
        }
        dfs(i, count);
        dfs(i + 1, count);
        mk[i] -= 1;
        num -= 1;
        count -= temp;
    }
}
