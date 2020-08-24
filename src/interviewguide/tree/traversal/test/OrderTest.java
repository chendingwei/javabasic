package interviewguide.tree.traversal.test;

import interviewguide.tree.traversal.InOrder;
import interviewguide.tree.traversal.PreOrder;
import interviewguide.tree.TreeNode;

public class OrderTest {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        PreOrder preOrder = new PreOrder();
//        preOrder.preOrder(root);

        InOrder inOrder = new InOrder();
        inOrder.inOrder(root);

    }
}
