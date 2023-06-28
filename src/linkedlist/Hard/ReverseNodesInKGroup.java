package linkedlist.Hard;

//Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.
//Youtube - https://www.youtube.com/watch?v=vqaO4oIJqnI
public class ReverseNodesInKGroup {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        for(int i =0; i<k; i++){
            if(temp == null) return head;
            temp = temp.next;
        }

        ListNode sp = reverseKGroup(temp, k);
        ListNode prev = null;
        ListNode curr = head;
        for(int i = 0; i<k; i++){
            ListNode nextnode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextnode;
        }
        head.next = sp;
        return prev;

    }
}
