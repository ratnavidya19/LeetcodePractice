package SLowFastPointer.Easy;

//Given the head of a linked list and an integer val, remove all the nodes of the linked list that has
// Node.val == val, and return the new head.
public class RemoveLinkedListElements {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {

        if(head == null) return null;
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode curr = head;
        ListNode prev = temp;

        while(curr!= null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            else
            {
                prev = curr;
            }

            curr = curr.next;

        }
        return temp.next;
    }
}
