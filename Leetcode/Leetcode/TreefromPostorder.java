class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int value) {
        val = value;
        left = right = null;
    }
}

public class TreefromPostorder {
    
    static int postIndex;

    static TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1; // Initialize the postIndex to the last element of postorder
        return buildTreeHelper(inorder, postorder, 0, inorder.length - 1);
    }

    static TreeNode buildTreeHelper(int[] inorder, int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null; // Base case: Empty subtree
        }

        // Construct the root node using the last element of postorder
        TreeNode root = new TreeNode(postorder[postIndex--]);

        // Find the index of the root in inorder traversal
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
                break;
            }
        }

        // Construct right and left subtrees recursively
        root.right = buildTreeHelper(inorder, postorder, inIndex + 1, inEnd);
        root.left = buildTreeHelper(inorder, postorder, inStart, inIndex - 1);

        return root;
    }

    static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        int[] inorder1 = {4, 8, 2, 5, 1, 6, 3, 7};
        int[] postorder1 = {8, 4, 5, 2, 6, 7, 3, 1};
        TreeNode root1 = buildTree(inorder1, postorder1);
        System.out.println("Inorder traversal of the constructed tree (Example 1):");
        inorderTraversal(root1);
        System.out.println();

        int[] inorder2 = {9, 5, 2, 3, 4};
        int[] postorder2 = {5, 9, 3, 4, 2};
        TreeNode root2 = buildTree(inorder2, postorder2);
        System.out.println("\nInorder traversal of the constructed tree (Example 2):");
        inorderTraversal(root2);
    }
}
