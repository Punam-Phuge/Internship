

    class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }
    
    public class BInaryTreeprun {
        public TreeNode pruneTree(TreeNode root) {
            return containsOne(root) ? root : null;
        }
    
        private boolean containsOne(TreeNode node) {
            if (node == null) {
                return false;
            }
    
            boolean leftContainsOne = containsOne(node.left);
            boolean rightContainsOne = containsOne(node.right);
    
            if (!leftContainsOne) {
                node.left = null;
            }
    
            if (!rightContainsOne) {
                node.right = null;
            }
    
            return node.val == 1 || leftContainsOne || rightContainsOne;
        }
    
        public static void main(String[] args) {
            BInaryTreeprun solution = new BInaryTreeprun();
    
            // case: 1
            TreeNode root1 = new TreeNode(1);
            root1.right = new TreeNode(0);
            root1.right.left = new TreeNode(0);
            root1.right.right = new TreeNode(1);
    
            TreeNode result1 = solution.pruneTree(root1);
            System.out.println("Example 1: " + result1.val); 
    
            //case:2
            TreeNode root2 = new TreeNode(1);
            root2.left = new TreeNode(0);
            root2.right = new TreeNode(1);
            root2.left.left = new TreeNode(0);
            root2.left.right = new TreeNode(0);
            root2.right.left = new TreeNode(0);
            root2.right.right = new TreeNode(1);
    
            TreeNode result2 = solution.pruneTree(root2);
            System.out.println("Example 2: " + result2.val); 
        }
    }
    
    

