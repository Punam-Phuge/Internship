
import java.util.*;
public class FindLargeBT {

    static class Node {
        int val;
        Node left, right;
    };

    /*
     * Recursive function to find
     * the largest value on each level
     */
    static void helper(Vector<Integer> res, Node root, int d) {
        if (root == null)
            return;

        // Expand list size
        if (d == res.size())
            res.add(root.val);

        else

            // to ensure largest value
            // on level is being stored
            res.set(d, Math.max(res.get(d), root.val));

        // Recursively traverse left and
        // right subtrees in order to find
        // out the largest value on each level
        helper(res, root.left, d + 1);
        helper(res, root.right, d + 1);
    }

    // function to find largest values
    static Vector<Integer> largestValues(Node root) {
        Vector<Integer> res = new Vector<>();
        helper(res, root, 0);
        return res;
    }

    /*
     * Helper function that allocates a
     * new node with the given data and
     * NULL left and right pointers.
     */
    static Node newNode(int data) {
        Node temp = new Node();
        temp.val = data;
        temp.left = temp.right = null;
        return temp;
    }

    // Driver code
    public static void main(String[] args) {
        /// case1
        Node root = null;
        root = newNode(1);
        root.left = newNode(3);
        root.right = newNode(2);
        root.left.left = newNode(5);
        root.left.right = newNode(3);
        root.right.right = newNode(9);
        System.out.printf("Output Case1:");

        Vector<Integer> res = largestValues(root);
        for (int i = 0; i < res.size(); i++)
            System.out.print(+res.get(i) + " ");
            
        /// case2
        System.out.printf("%n");

        Node root1 = null;
        root1 = newNode(1);
        root1.left = newNode(3);
        root1.right = newNode(2);

        System.out.printf("Output Case2:");
        Vector<Integer> res1 = largestValues(root1);
        for (int i = 0; i < res1.size(); i++)
            System.out.print(res1.get(i) + " ");
    }
}
