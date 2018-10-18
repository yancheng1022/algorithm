package demo;


class Node{
    int value;
    Node next;
    Node(int value,Node node){
        this.value = value;
    }
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

    //�ǵݹ鷨
    //�������� ���ν���
    public Node reverseList2(Node node){
        Node prev = null;
        while (node != null){
            Node tmp = node.next;
            node.next = prev;
            prev = node;
            node = tmp;
        }
        return prev;
    }

}
