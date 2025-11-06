package LinkedList.Ques;

public class reverseLL_recursive {

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
            return reverseRecursive(head, null);
        }

        private ListNode reverseRecursive(ListNode curr, ListNode prev) {
            if (curr == null)
                return prev;

            ListNode next = curr.next;
            curr.next = prev;
            return reverseRecursive(next, curr);
        }

    }
}
