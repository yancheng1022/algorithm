package getOffer;

import java.util.ArrayList;
        import java.util.Stack;
public class Exam05_isPopSequence {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA.length == 0 || popA.length == 0)
            return false;
        Stack<Integer> s = new Stack<Integer>();
        //���ڱ�ʶ�������е�λ��
        int popIndex = 0;
        for(int i = 0; i< pushA.length;i++){
            s.push(pushA[i]);
            //���ջ��Ϊ�գ���ջ��Ԫ�ص��ڵ�������
            while(!s.empty() &&s.peek() == popA[popIndex]){
                //��ջ
                s.pop();
                //�����������һλ
                popIndex++;
            }
        }
        return s.empty();
    }
}