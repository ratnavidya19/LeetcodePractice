package SLowFastPointer.Medium;

import SLowFastPointer.Easy.LinkedListCycle;
//Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
public class LinkedListCycleII {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                ListNode temp = head;
                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }

                return temp;
            }
        }


        return null;


    }
}
