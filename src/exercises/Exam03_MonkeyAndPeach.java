package exercises;

/*

����
��̽������͵�ҵ����⡣ ���ӵ�һ��͵�����ɸ����ӣ���������һ�룬������񫣬�ֶ����һ�����ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ��������N���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲͵�˶��١�

����
һ������N���������� (2 < N < 30)

���
��һ�������͵��������


*/
import java.util.Scanner;

public class Exam03_MonkeyAndPeach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int result = 1;
        for(int i = 0;i < N -1;i++){
            result  = (result +1)*2;
        }
        System.out.println(result);
    }
}
