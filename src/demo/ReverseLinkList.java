package demo;


import java.util.Scanner;

class Node{
    int value;
    Node next;

}


public class ReverseLinkList {

    //�ݹ鷨
    //�ڵ�Ϊ�ջ���Ϊβ�ڵ㣬ֱ�ӷ���
    public Node reversrList(Node node){
        if(node == null || node.next == null){
            return node;
        }
        //��ǰ�ڵ����һ���ڵ㷴ת
        Node prev = reversrList(node.next);
        //��һ���ڵ��nextָ��ǰ�ڵ�
        node.next.next = node;
        //��ǰ�ڵ����һ�ڵ�ָ��null
        node.next = null;
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String ss[] = s.split(" ");
        int arr[] = new int[N];
        for (int i=0;i<N;i++){
            arr[i] = Integer.parseInt(ss[i]);
        }
        int end = sc.nextInt();

    }

    //�ǵݹ鷨
    //�������� ���ν���
//    public Node reverseList2(Node node){
//        Node prev = null;
//        while (node != null){
//            Node tmp = node.next;
//            node.next = prev;
//            prev = node;
//            node = tmp;
//        }
//        return prev;
//    }

}
