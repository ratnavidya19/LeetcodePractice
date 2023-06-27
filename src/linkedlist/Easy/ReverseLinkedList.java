package linkedlist.Easy;

public class ReverseLinkedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        while(head != null){
            ListNode nextnode = head.next;
            head.next = prev;
            prev = head;
            head = nextnode;
        }

        return prev;

    }
}
