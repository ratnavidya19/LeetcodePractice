package SLowFastPointer.Easy;

//Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
//Return the linked list sorted as well.
public class RemoveDuplicatesfromSortedList {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode curr = head;
        while(head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }
        return curr;
    }
}
