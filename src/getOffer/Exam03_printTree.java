package getOffer;

import java.util.ArrayList;
import java.util.List;

public class Exam03_printTree {

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<TreeNode> queue = new ArrayList<>();

        if (root == null){
            return list;
        }
        queue.add(root);
        while (queue.size()!=0){
            TreeNode temp = queue.remove(0);
            if (temp.left != null){
                queue.add(temp.left);
            }
            if (temp.right != null){
                queue.add(temp.right);
            }
            list.add(temp.val);
        }

        return list;
    }
}
