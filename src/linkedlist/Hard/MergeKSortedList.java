package linkedlist.Hard;

import java.util.PriorityQueue;

//You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
//Merge all the linked-lists into one sorted linked-list and return it.
//Youtube - https://www.youtube.com/watch?v=0_PSq3j8GrY&t=806s
public class MergeKSortedList {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeKLists(ListNode[] lists) {


        //Solution 1 - using priority queue
        if(lists.length == 0){
            return null;
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(ListNode list : lists){
            while(list != null){
                queue.add(list.val);
                list = list.next;
            }
        }

        ListNode head;
        if(!queue.isEmpty()){
            head = new ListNode(queue.poll());
        }
        else
        {
            return null;
        }

        ListNode temp = head;
        while(!queue.isEmpty()){
            temp.next = new ListNode(queue.poll());
            temp = temp.next;
        }

        temp.next = null;

        return head;


        //Solution 2 - recursion

//        ListNode ans = null;
//        for(ListNode list:lists){
//            ans = MergeTwoList(ans, list);
//
//        }

//        return ans;

    }

    public ListNode MergeTwoList(ListNode l1, ListNode l2){

        if(l1 == null) return l2;

        if(l2 == null) return l1;

        if(l1.val < l2.val){
            l1.next = MergeTwoList(l1.next, l2);
            return l1;
        }
        else
        {
            l2.next = MergeTwoList(l1, l2.next);
            return l2;
        }
    }
}
