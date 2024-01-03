public class SymmetricTree {
    public static boolean isSymmetric(TreeNode root) {
        return isSymmetricTree(root, root);
    }

    public static boolean isSymmetricTree(TreeNode leftSubTree, TreeNode rightSubTree){
        if(leftSubTree == null  && rightSubTree == null){
            return true;
        }
        if(leftSubTree == null || rightSubTree==null){
            return false;
        }
        return leftSubTree.val == rightSubTree.val && isSymmetricTree(leftSubTree.left, rightSubTree.right) && isSymmetricTree(leftSubTree.right,rightSubTree.left);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        TreeNode leftTree = new TreeNode(2);
        leftTree.left = new TreeNode(3);
        leftTree.right = new TreeNode(4);
        tree.left = leftTree;
        TreeNode rightTree = new TreeNode(2);
        rightTree.left = new TreeNode(4);
        rightTree.right = new TreeNode(3);
        tree.right = rightTree;

        System.out.println(isSymmetric(tree));
    }
}
