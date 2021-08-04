package Trees;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversalMain {

    public static void main(String[] args) {
        TreeNode tree1 = new TreeNode(5);
        tree1.leftNode = new TreeNode(3);
        tree1.leftNode.leftNode = new TreeNode(1);
        tree1.rightNode = new TreeNode(7);
        tree1.rightNode.leftNode = new TreeNode(6);

        TreeNode tree2 = new TreeNode(3);
        tree2.leftNode = new TreeNode(1);
        tree2.rightNode = new TreeNode(6);
        tree2.rightNode.leftNode = new TreeNode(5);
        tree2.rightNode.rightNode = new TreeNode(7);

        List<Integer> tree1Traversal = new ArrayList<>();
        List<Integer> tree2Traversal = new ArrayList<>();
        System.out.println(inorderTraversal(tree1,tree1Traversal));
        System.out.println((inorderTraversal(tree2,tree2Traversal)));

    }

    /*
        Output of the inorder traversal is [1,3,5,6,7] in both trees
    */

    public static List<Integer> inorderTraversal(TreeNode root,List<Integer> tree1Traversal) {
        if(root == null) return tree1Traversal;
        inorderTraversal(root.leftNode,tree1Traversal);
        tree1Traversal.add(root.value);
        inorderTraversal(root.rightNode,tree1Traversal);
        return tree1Traversal;
    }


}
