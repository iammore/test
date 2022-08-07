import java.util.List;

public class AddLists {
   static   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
    int ans=4%10;
        System.out.println(ans);
        ListNode root1=new ListNode();
        ListNode root2=new ListNode();
        root1.val=7;
        root1.next=new ListNode(1, new ListNode());
        root1.next.next=new ListNode(6,new ListNode());
        root2.val=5;
        root2.next=new ListNode(9, new ListNode());
        root2.next.next=new ListNode(2,new ListNode());
       /* while (root1.next!=null){
            System.out.println(root1.val);
            System.out.println(root2.val);
            root1=root1.next;
            root2=root2.next;
        }*/
        ListNode finalSum = new ListNode();
        int k = 0,sum=0;
        while (root1.next!=null){
            int interSum=root1.val+ root2.val+k;
            //System.out.println(interSum+"interSum");
            //System.out.println(root1.val+"          "+root2.val);
             if (interSum>10){
                 finalSum.val=interSum%10;
               //  System.out.println(interSum%10);
                 finalSum.next=new ListNode();
                 k=1;
             }else {
                 finalSum.val=interSum;
                 finalSum.next=new ListNode();
                 k=0;
             }
            System.out.println(finalSum.val+"finalSum val");
             finalSum=finalSum.next;

       root1=root1.next;root2=root2.next; }
    while (finalSum.next!=null){
        System.out.println(finalSum.val);
        finalSum=finalSum.next;
    }
    }











}
