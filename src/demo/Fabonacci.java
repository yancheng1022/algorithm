package demo;
/*
    ��׳� ��ӡi-j ������� ��ת�ַ��� �����е���˼ά
    쳲��������� ���Լ��f(m,n)=f(n,m%n) ��������������û�е��ƹ�ʽ����û�еȼ�ת����


*/

/*
    쳲����������У�
    F(1)=1��F(2)=1, F(n)=F(n-1)+F(n-2)��n>=3��n��N*��
*/
public class Fabonacci {
    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int fib(int n){
        if(n == 1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
}
