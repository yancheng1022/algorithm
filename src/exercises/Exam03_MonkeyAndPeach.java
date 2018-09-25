package exercises;

/*

描述
编程解决猴子偷桃的问题。 猴子第一天偷了若干个桃子，当即吃了一半，还不过瘾，又多吃了一个；第二天早上又将剩下的桃子吃掉一半，又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第N天早上想再吃时，见只剩下一个桃子了。求第一天共偷了多少。

输入
一个整数N代表天数。 (2 < N < 30)

输出
第一天猴子所偷桃子数。


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
