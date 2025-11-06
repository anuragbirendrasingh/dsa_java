package LinkedList.Ques;

public class Intersection_Of_Two_LL {
    	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            ListNode anurag = headA ;
            ListNode girlfirend = headB ;

            while(anurag!=girlfirend){
                if(anurag!=null){
                    anurag = anurag.next ;
                }else{
                    anurag = headB ;
                }
                if(girlfirend!=null){
                    girlfirend = girlfirend.next;
                }else{
                    girlfirend = headA;
                }
            }
            return anurag;
            
            
}
    }
}
