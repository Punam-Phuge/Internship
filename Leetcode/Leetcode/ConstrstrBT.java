class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class ConstrstrBT {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        String result = Integer.toString(t.val);

        if (t.left != null || t.right != null) {
            result += "(" + tree2str(t.left) + ")";
        }

        if (t.right != null) {
            result += "(" + tree2str(t.right) + ")";
        }

        return result;
    }

    public static void main(String[] args) {
        ConstrstrBT solution = new ConstrstrBT();

        // Case: 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.left.left = new TreeNode(4);
        root1.right = new TreeNode(3);
        System.out.println("Example 1: " + solution.tree2str(root1));

        // Case: 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(3);
        System.out.println("Example 2: " + solution.tree2str(root2));
    }
}
