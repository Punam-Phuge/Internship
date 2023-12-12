import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class SerializeandDeserialize {

    // Serialization
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialized(root, sb);
        return sb.toString();
    }

    private void serialized(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return;
        }

        // Append the current node's value
        sb.append(node.val).append(',');

        // Recursively serialize left and right subtrees
        serialized(node.left, sb);
        serialized(node.right, sb);
    }

    // Deserialization
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }

        String[] values = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(values));

        return deserializedd(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode deserializedd(Queue<String> queue, int lower, int upper) {
        if (queue.isEmpty()) {
            return null;
        }

        int val = Integer.parseInt(queue.peek());
        if (val < lower || val > upper) {
            return null;
        }

        queue.poll(); // remove the value from the queue

        TreeNode node = new TreeNode(val);
        node.left = deserializedd(queue, lower, val);
        node.right = deserializedd(queue, val, upper);

        return node;
    }

    public static void main(String[] args) {
        SerializeandDeserialize serializer = new SerializeandDeserialize();

        // Example 1
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);

        String serialized1 = serializer.serialize(root1);
        System.out.println("Serialized Tree 1: " + serialized1);

        TreeNode deserialized1 = serializer.deserialize(serialized1);
        System.out.println("Deserialized Tree 1: " + serializer.serialize(deserialized1));

        // Example 2
        TreeNode root2 = null;

        String serialized2 = serializer.serialize(root2);
        System.out.println("Serialized Tree 2: " + serialized2);

        TreeNode deserialized2 = serializer.deserialize(serialized2);
        System.out.println("Deserialized Tree 2: " + serializer.serialize(deserialized2));
    }
}
