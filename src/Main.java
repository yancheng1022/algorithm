import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*������������������ʵ����ĿҪ��Ĺ���
    ��Ȼ����Ҳ���Բ������������ģ����������ȫ�����Լ����뷨�� ^-^
    ******************************��ʼд����******************************/
    static boolean get24(int[] nums) {
        return false;

    }
    /******************************����д����******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        boolean res;

        int _nums_size = 0;
        _nums_size = Integer.parseInt(in.nextLine().trim());
        int[] _nums = new int[_nums_size];
        int _nums_item;
        for(int _nums_i = 0; _nums_i < _nums_size; _nums_i++) {
            _nums_item = Integer.parseInt(in.nextLine().trim());
            _nums[_nums_i] = _nums_item;
        }

        res = get24(_nums);
        System.out.println(String.valueOf(res ? 1 : 0));
    }
}
