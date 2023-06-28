package linkedlist.Medium;

//
//Youtube - https://www.youtube.com/watch?v=mD7L5l2NmGU
//Time complexity = O(n)
public class ReorderList {

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

    public void reorderList(ListNode head) {
        //find mid
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode mid = slow;

        ListNode second = mid.next;
        mid.next = null;

        //reverse the second list
        ListNode prev = null;
        while(second != null){
            ListNode nextnode = second.next;
            second.next = prev;
            prev = second;
            second = nextnode;
        }

        //merge
        ListNode first = head;
        ListNode other = prev;
        while(other != null){
            ListNode temp1 = first.next;
            ListNode temp2 = other.next;
            first.next = other;
            other.next = temp1;
            first = temp1;
            other = temp2;
        }
    }
}
