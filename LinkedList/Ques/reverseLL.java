package LinkedList.Ques;

public class reverseLL {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {

            ListNode currNode = head;
            ListNode prev = null;

            while (currNode != null) {
                ListNode ahead = currNode.next;
                currNode.next = prev;

                prev = currNode;
                currNode = ahead;
            }

            return prev;

        }

    }
}
