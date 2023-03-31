package SLowFastPointer.Easy;

//Given head, the head of a linked list, determine if the linked list has a cycle in it.
//reference - https://www.youtube.com/watch?v=6OrZ4wAy4uE
public class LinkedListCycle {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

    public boolean hasCycle(ListNode head) {

        if(head == null) return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow= slow.next;   //slow pointer moves by 1
            fast= fast.next.next;  //fast pointer moves by 2

            if(slow == fast) return true;
        }

        return false;
    }
}
