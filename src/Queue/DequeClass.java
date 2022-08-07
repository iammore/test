package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeClass {

    public static void main(String[] args) {
        Deque deque=new ArrayDeque();
        deque.addFirst(123);
        deque.addFirst(456);
        deque.addFirst(789);
        deque.addFirst(147);
        deque.addFirst(258);

        System.out.println(deque);
        Iterator iterator=deque.iterator();


    }
}
