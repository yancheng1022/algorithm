package demo;


import java.util.Scanner;

class Node{
    int value;
    Node next;

}


public class ReverseLinkList {

    //递归法
    //节点为空或者为尾节点，直接返回
    public Node reversrList(Node node){
        if(node == null || node.next == null){
            return node;
        }
        //当前节点和下一个节点反转
        Node prev = reversrList(node.next);
        //下一个节点的next指向当前节点
        node.next.next = node;
        //当前节点的下一节点指向null
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

    //非递归法
    //遍历链表 依次交换
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
