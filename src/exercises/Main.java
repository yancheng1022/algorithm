package exercises;
import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


class ListNode {
     int val;
    ListNode next;
     ListNode(int x) {
         val = x;
        next = null;
     }
 }

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<ListNode> list = new ArrayList<ListNode>();
        while (input.hasNext()) {
            list.add(string2ListNode(input.next()));
        }

        System.out.print(listNode2String(new Main().mergeKLists(list)));
    }

    static ListNode string2ListNode(String str) {
        StringTokenizer token = new StringTokenizer(str, ",");
        ListNode head, foot;
        head = foot = new ListNode(0);
        while(token.hasMoreTokens()) {
            int val = Integer.parseInt(token.nextToken());
            foot = foot.next = new ListNode(val);
        }
        return head.next;
    }

    static String listNode2String(ListNode listNode) {
        StringBuilder result = new StringBuilder();
        while (listNode != null) {
            result.append(listNode.val).append(",");
            listNode = listNode.next;
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        return result.toString();
    }

    public ListNode mergeKLists(List<ListNode> lists) {
        if(lists==null||lists.size()==0){
            return null;
        }
        ListNode list=MergeList(lists,0,lists.size()-1);
        return list;
    }
    public ListNode MergeList(List<ListNode> lists,int low,int high){
        if(low>=high) return lists.get(low);
        int mid=low+(high-low)/2;
        ListNode left=MergeList(lists,low,mid);
        ListNode right=MergeList(lists,mid+1,high);
        return Merge(left,right);
    }
    public ListNode Merge(ListNode left,ListNode right){
        ListNode h=new ListNode(-1);
        ListNode list=h;
        while(left!=null&&right!=null){
            if(left.val<=right.val){
                list.next=left;
                left=left.next;
            }else{
                list.next=right;
                right=right.next;
            }
            list=list.next;
        }
        if(left!=null){
            list.next=left;
        }
        if(right!=null){
            list.next=right;
        }
        return h.next;
    }
}