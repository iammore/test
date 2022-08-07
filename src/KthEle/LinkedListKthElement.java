package KthEle;

import java.util.LinkedList;
import java.util.List;

public class LinkedListKthElement {

    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list.get(4));

       /* int size=0;
        if(head.next==null) return null;
        ListNode current=head;
        while(head!=null){
            size++;
            head=head.next;
        }
        head=current;
        int index=size/2;
        size=0;
        while(head!=null){
            if(size==index-1){
                head.next=head.next.next;
            }else{
                head=head.next;
            }


            size++;}
        return current;*/
    }
}
