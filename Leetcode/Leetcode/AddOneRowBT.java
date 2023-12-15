    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    
    public class AddOneRowBT {
        public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if (depth == 1) {
                TreeNode newRoot = new TreeNode(val);
                newRoot.left = root;
                return newRoot;
            }
            helper(root, val, depth, 1);
            return root;
        }
    
        private void helper(TreeNode node, int val, int depth, int currentDepth) {
            if (node == null) {
                return;
            }
    
            if (currentDepth == depth - 1) {
                TreeNode leftNode = new TreeNode(val);
                leftNode.left = node.left;
                node.left = leftNode;
    
                TreeNode rightNode = new TreeNode(val);
                rightNode.right = node.right;
                node.right = rightNode;
            } else {
                helper(node.left, val, depth, currentDepth + 1);
                helper(node.right, val, depth, currentDepth + 1);
            }
        }
    
        public static void main(String[] args) {
            AddOneRowBT solution = new AddOneRowBT();
    
            // Case1:
            TreeNode root1 = new TreeNode(4);
            root1.left = new TreeNode(2);
            root1.right = new TreeNode(6);
            root1.left.left = new TreeNode(3);
            root1.left.right = new TreeNode(1);
            root1.right.left = new TreeNode(5);
    
            TreeNode result1 = solution.addOneRow(root1, 1, 2);
            System.out.println("Example 1: " + result1.val);
    
            // Case2:
            TreeNode root2 = new TreeNode(4);
            root2.left = new TreeNode(2);
            root2.left.right = new TreeNode(3);
            root2.left.right.left = new TreeNode(1);
    
            TreeNode result2 = solution.addOneRow(root2, 1, 3);
            System.out.println("Example 2: " + result2.val); 
        }
    }
    
    

