package LeetCode;

public class MergeTwoSortedLists {

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
  /*  class Solution {
        ListNode cuurent=new ListNode();
        ListNode list3=cuurent;
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            while(list1 != null && list2 !=null ){
                if(list1.val<=list2.val){
                    list3.next=new ListNode(list1.val,list3.next);

                    list1=list1.next;
                }else{
                    list3.next=new ListNode(list2.val,list3.next);
                    list2=list2.next;
                }
                list3=list3.next;
            }
            list3.next=list1!=null?list1:list2;
            return cuurent.next;
        }
    }*/
}
