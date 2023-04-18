package SLowFastPointer.Medium;

//Given the head of a linked list, remove the nth node from the end of the list and return its head.
//reference - https://www.youtube.com/watch?v=XtYEEvrhemI
public class RemoveNthNodeFromEndofList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 1; i <= n+1; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
