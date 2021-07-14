
public class BinaryTree {

    public static void reverse(Node root) {

    }

    public static class Node {
        public Node left = null;
        public Node right = null;
        public final String text;
        public Node(String text) {
            this.text = text;
        }

        public Node(String text, String l, String r) {
            this.text = text;
            this.left = new Node(l);
            this.right = new Node(r);
        }
    }
}
