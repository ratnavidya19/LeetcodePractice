package TwoPointers.Easy;

//You are given the heads of two sorted linked lists list1 and list2.
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//reference - https://www.youtube.com/watch?v=KVf1Uuqfv8E
public class MergeTwoSortedLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //recursion method
        /* if(list1 == null)
        {
            return list2;
        }
        else if(list2 == null)
        {
            return list1;
        }
        else if(list1.val < list2.val)
        {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else
        {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }.  */

        ListNode temp_node = new ListNode(0);
        ListNode curr_node = temp_node;

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                curr_node.next = list1;
                list1 = list1.next;
            }
            else{
                curr_node.next = list2;
                list2 = list2.next;
            }

            curr_node = curr_node.next;
        }
        if(list1 != null){
            curr_node.next = list1;
            list1 = list1.next;
        }
        if(list2 != null){
            curr_node.next = list2;
            list2 = list2.next;
        }

        return temp_node.next;
    }
}
