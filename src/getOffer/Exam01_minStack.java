package getOffer;

import java.util.Stack;

/**
 * @Author yc
 * @Date 2018/11/3 19:15
 *
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 *
 * 需要借助一个辅助空间（往另一个倒的时候选出最小，再倒回去）
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
