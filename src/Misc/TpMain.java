package Misc;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TpMain implements Cloneable{


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    String name;


    public static void main(String[] args) throws CloneNotSupportedException {
        TpMain t1=new TpMain();
        t1.name="mahendra";
        TpMain t2= (TpMain) t1.clone();
        TpMain t3= t1;
       /* System.out.println("t3 "  + t3.name);
        int[] arr={7,8,564,12,3,4,4,5};
        System.out.println(Arrays.toString(Arrays.stream(arr).sorted().toArray()));
        System.out.println(Arrays.toString(arr));*/
        List<Integer> list =new LinkedList<>();
        list.add(123);
        list.add(12);
        list.add(56);
        list.add(789);
        list.add(526);
        list.add(333);
        list.add(1);


        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
           // iterator.forEachRemaining(StackTraceElement);
        }

      //  System.out.println(sr.lines().findAny().);

     /*   System.out.println("St"+ 100+100);
        System.out.println(100+100+"str");*/
      /*  System.out.println(t1);
        System.out.println(t3);
        System.out.println(t2.name);*/
    }
}
