import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversalMain {

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
        System.out.println(postOrderTraversal(tree1,tree1Traversal));
        System.out.println((postOrderTraversal(tree2,tree2Traversal)));
    }

     /*
        tree1 postOrderTraversal traversal should be: [5, 3, 1, 7, 6]
        tree2 postOrderTraversal traversal should be: [3, 1, 6, 5, 7]
     */

    public static List<Integer> postOrderTraversal(TreeNode root,List<Integer> tree1Traversal) {
        if(root == null) return tree1Traversal;
        postOrderTraversal(root.leftNode,tree1Traversal);
        postOrderTraversal(root.rightNode,tree1Traversal);
        tree1Traversal.add(root.value);
        return tree1Traversal;
    }


}
