package Tree.Interview.Code;

public class countNoN_leafNodes {

    public static void main(String[] args) {
        countNoN_leafNodes bt = new countNoN_leafNodes();
        Node root = bt.new Node(1);
        root.left = bt.new Node(2);
        root.right = bt.new Node(3);
        root.left.left = bt.new Node(4);
        root.right.right = bt.new Node(5);
        int ans = count_Non_Leaf(root);
        System.out.println(ans);
    }

    public static int count_Non_Leaf(Node nn){
        if(nn == null){
            return 0 ;
        }
        if(nn.left == null && nn.right == null){
            return 0 ;
        }
        int left = count_Non_Leaf(nn.left);
        int right = count_Non_Leaf(nn.right);
        return 1 + left + right ;
    }
    
    class Node{
        int val ;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            left = right = null;

        }
    }
}
