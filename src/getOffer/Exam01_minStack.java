package getOffer;

import java.util.Stack;

/**
 * @Author yc
 * @Date 2018/11/3 19:15
 *
 * ��Ŀ����
 * ����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 *
 * ��Ҫ����һ�������ռ䣨����һ������ʱ��ѡ����С���ٵ���ȥ��
 */
public class Exam01_minStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node){
        stack.push(node);
    }

    public void pop(){
        stack.pop();
    }

    public int top(){
        return stack.peek();
    }

    public int min(){
        int min = Integer.MAX_VALUE;
        while (stack.empty() != true){
            int node = stack.pop();
            if (node < min){
                min = node;
            }
            stack2.push(node);
        }
        while (stack2.empty() != true){
            stack.push(stack2.pop());
        }
        return min;
    }
}
