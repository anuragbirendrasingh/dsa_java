package LinkedList.Ques;
public class hasCycle {
   	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

    public class solution{

        public boolean iscycle(ListNode head){
            ListNode slow = head ;
            ListNode fast = head ;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow = slow.next ;

                if(slow == fast){
                    return true ;
                }
            }
            return false ;
        }
    }

    
}
