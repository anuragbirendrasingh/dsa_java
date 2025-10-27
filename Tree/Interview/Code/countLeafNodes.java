package Tree.Interview.Code;

public class countLeafNodes {
    public static void main(String[] args) {
        countLeafNodes bt = new countLeafNodes();
        Node root = bt.new Node(1);
        root.left = bt.new Node(2);
        root.right = bt.new Node(3);
        root.left.left = bt.new Node(4);
        root.right.right = bt.new Node(5);
        int ans = count_leaf(root);
        System.out.println(ans);
    }

    public static int count_leaf(Node nn) {

        if (nn == null) {
            return 0;
        }

        if (nn.left == null && nn.right == null) {
            return 1;
        }

        int left_subtree = count_leaf(nn.left);
        int right_subtree = count_leaf(nn.right);
        return left_subtree + right_subtree;
    }

    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
}
