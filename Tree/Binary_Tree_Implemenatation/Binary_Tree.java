package Tree.Binary_Tree_Implemenatation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Binary_Tree {

    public class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;

    Scanner sc = new Scanner(System.in);

    public Binary_Tree() {
        root = createTree();
    }

    private Node createTree() {
        int val = sc.nextInt();
        Node nn = new Node();
        nn.val = val;
        boolean hlc = sc.nextBoolean();
        if (hlc) { // has left child
            nn.left = createTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }
        return nn;

    }

    public void Display(){
        Display(root);
    }

    private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String s = "<--" + nn.val + "-->";
		if (nn.left != null) {
			s = nn.left.val + s;
		} else {
			s = "." + s;
		}

		if (nn.right != null) {
			s = s + nn.right.val;
		} else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}

    public int max(){
        return max(root);
    }

    private int max(Node nn){
        if(nn == null){
            return Integer.MIN_VALUE;
        }

        int lmax = max(nn.left);
        int rmax = max(nn.right);
        return Math.max(nn.val,Math.max(lmax,rmax));
    }

    public boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node nn , int item){
        if(nn == null){
            return false;
        }
        if(nn.val == item){
            return true;
        }
        boolean left = find(nn.left,item);
        boolean right = find(nn.right,item);
        return left|| right ;
    }

    public int ht() {
		return ht(root);
	}

	private int ht(Node node) {
		if (node == null) {
			return 0;
		}
		int lh = ht(node.left);
		int rh = ht(node.right);
		return Math.max(lh, rh) + 1;

	}

	public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		if (node == null) {
			return;
		}

		System.out.print(node.val + " ");
		PreOrder(node.left);
		PreOrder(node.right);
	}

	public void PostOrder() {
		PostOrder(this.root);
		System.out.println();
	}

	private void PostOrder(Node node) {
		if (node == null) {
			return;
		}
		PostOrder(node.left);
		PostOrder(node.right);
		System.out.print(node.val + " ");
	}
	public void INOrder() {
		INOrder(this.root);
		System.out.println();
	}
	
	private void INOrder(Node node) {
		if (node == null) {
			return;
		}
		INOrder(node.left);
		System.out.print(node.val + " ");
		INOrder(node.right);
		
	}

    public void Level_Order(){
           Level_Order(root);
    }

    private void Level_Order(Node root){
         Queue <Node> q = new LinkedList<>();
         q.add(root);
         while(!q.isEmpty()){
            Node currNode = q.poll();
            System.out.print(currNode.val + " ");
            
            if(currNode.left!=null){
               q.add(currNode.left);
            }
            if(currNode.right!=null){
                q.add(currNode.right);
            }
         }
         System.out.println();
    }
}
