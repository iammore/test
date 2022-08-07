package RemoveDupsFromLL;

public class RemoveDups {

    static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

   static class Solution {
        public static void main(String[] args) {
            ListNode five=new ListNode(5,null);
            ListNode four2=new ListNode(4,five);
            ListNode four=new ListNode(4,four2);
            ListNode three2=new ListNode(3,four);
            ListNode three=new ListNode(3,three2);
            ListNode two=new ListNode(2,three);
            ListNode head=new ListNode(1,null);
            ListNode ans=deleteDuplicates(head);
            while(ans.next!=null){
                System.out.println("ans is"+ans.val);
                ans=ans.next;
            }
        }
        public static ListNode deleteDuplicates(ListNode head) {
            ListNode current=head;
            if(head==null) return head;
            while(current.next!=null){
                if(current.val==current.next.val){
                    current=current.next.next;
                    //current=current.next;
                    // current.next=current.next.next;
                }else{
                    current=current.next;
                }

            }
            return head;  }


        public ListNode sadeleteDuplicates(ListNode head) {
            ListNode current=head;
            if(head==null) return head;
            while(current.next!=null){
                if(current.next.val>current.val){
                    current=current.next;
                }else if(current.next.next==null){
                    current.next=current.next.next;
                    return head;
                }else{
                    current.next=current.next.next;
                }
            }
            return head;  }

    }

}
