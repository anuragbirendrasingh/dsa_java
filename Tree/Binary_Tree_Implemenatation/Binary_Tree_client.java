package Tree.Binary_Tree_Implemenatation;

public class Binary_Tree_client {
    public static void main(String[] args) {
        Binary_Tree bt = new Binary_Tree();   // tree create hogya
        bt.Display();
        System.out.println(bt.max());
		System.out.println(bt.find(67));
		System.out.println(bt.ht());
		bt.PreOrder();
		bt.PostOrder();
		bt.INOrder();
		bt.Level_Order();
    }
}
