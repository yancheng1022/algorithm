package sort;

/*
    ð�����򣺶����ڵ�Ԫ�ؽ��������Ƚϣ����ǰһ���Ⱥ�һ�����򽻻�λ�ã�����ÿһ�˾ͻ�ð��һ������
    ���ࣺ �ڲ��Ƚ�����
    ���ʱ�临�Ӷȣ�O��n^2�� ���ʱ�临�Ӷȣ� O��n�������ڱ�������������� ����Ҫ������Ļ����ϼӱ�־λ��

*/
public class Bubble {
    public static void main(String[] args) {
        int a[] = {1,5,9,3,7,0};
        sort(a);
        for (int i :a) {
            System.out.print(i+" ");
        }

    }

    public static void sort(int a[]){
        int len = a.length;
        for (int i = 0;i<len;i++){
            for (int j=0;j<len-i-1;j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

    }
}
