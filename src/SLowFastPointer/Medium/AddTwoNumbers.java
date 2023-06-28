package SLowFastPointer.Medium;

//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
// and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//Youtube - https://www.youtube.com/watch?v=di_jUp3tWUI
public class AddTwoNumbers {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        int carry = 0;
        ListNode head = l3;
        while(l1 != null && l2 != null){
            int value = l1.val + l2.val + carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l2 = l2.next;
            l1 = l1.next;

        }

        while(l1 != null){
            int value = l1.val  + carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l1 = l1.next;

        }

        while(l2 != null){
            int value = l2.val  + carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l2 = l2.next;

        }

        if(carry!=0){
            l3.next = new ListNode(carry);

        }
        return head.next;
    }
}
