package Queue;

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQ {


    public static void main(String[] args) {
        Queue queue=new PriorityQueue();

        queue.add(951);
        queue.add(789);
        queue.add(123);
        queue.add(456);
        queue.add(963);
        //CHECK in which ds u can add nulls
        queue.offer(null);
        int[] arr={89,23,11,31,41,10,10};
        Queue<Integer> queue1= new PriorityQueue();

        Iterator<Integer> iterator=Arrays.stream(arr).iterator();
while (iterator.hasNext()){
    queue1.offer(iterator.next());
}
        while(!queue1.isEmpty()) {
            System.out.println(queue1.remove());
        }


      //  System.out.println(queue.remove());
       /* System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue);*/

    }


}
