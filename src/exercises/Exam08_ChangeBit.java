package exercises;



/*
����
������������A��B����Ҫ�ı伸��������λ���ܽ�AתΪB��

����
1�У�A��B���ո����

���
��Ҫ�ı��λ��
*/
import java.util.Scanner;
public class Exam08_ChangeBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a & b;
        int d = a | b;
        int e = c ^ d;
        int count = 0;
        while (e != 0){
            e = (e-1)&e;
            count++;
        }

        System.out.print(count);
    }
}
/*
    �ɽ���Ŀת��Ϊ�����������������в���ͬ��λ��
    �� A = 0010 1011�� B = 0110 0101.
    A&B = 0010 0001
    A|B = 0110 1111
    E = A^B = 0100 1110  (1�ĸ�����λ�������в�ͬ��λ)

    e��e-1��ͣ���������㣬��������Ĵ�����Ϊ1�ĸ���
*/