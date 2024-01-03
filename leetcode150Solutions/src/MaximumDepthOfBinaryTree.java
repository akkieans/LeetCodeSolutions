import java.util.HashMap;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        int depth = 0;
        HashMap<Integer, Integer> depthMap = new HashMap<Integer, Integer>();
        while (root.left != null && root.right != null) {
            if (!depthMap.containsKey(root.val)) {
                depth++;
                depthMap.put(root.val, depth);
                if (root.left != null) {
                    root = root.right;
                }
            }

        }
        return  depth;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode rightSubTree = new TreeNode(20);
        rightSubTree.left = new TreeNode(15);
        rightSubTree.right = new TreeNode(7);
        root.right = rightSubTree;
        System.out.println(maxDepth(root));
    }
}
