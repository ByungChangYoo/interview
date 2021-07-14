import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    /**
     *     6
     *    /   \
     *   3     4
     *  / \   / \
     * 7   3 8   1
     *
     *      6
     *    /   \
     *   4     3
     *  / \   / \
     * 1   8 3   7
     *
     */
    @Test
    void test001() {
        BinaryTree.Node root = new BinaryTree.Node("6");
        root.left = new BinaryTree.Node("3", "7", "3");
        root.right = new BinaryTree.Node("4", "8", "1");

        String before = nodeToString(root);
        BinaryTree.reverse(root);
        String after = nodeToString(root);

        assertEquals("7336841", before);
        assertEquals("1486337", after);

    }

    /**
     *     4
     *    /   \
     *   2     7
     *  / \   / \
     * 1   3 6   9
     *
     *      4
     *    /   \
     *   7     2
     *  / \   / \
     * 9   6 3   1
     */
    @Test
    void test002() {
        BinaryTree.Node root = new BinaryTree.Node("4");
        root.left = new BinaryTree.Node("2", "1", "3");
        root.right = new BinaryTree.Node("7", "6", "9");

        String before = nodeToString(root);
        BinaryTree.reverse(root);
        String after = nodeToString(root);

        assertEquals("1234679", before);
        assertEquals("9764321", after);
    }



    public String nodeToString(BinaryTree.Node node) {
        if (node == null) {
            return "";
        }
        return nodeToString(node.left) + node.text + nodeToString(node.right);
    }
}