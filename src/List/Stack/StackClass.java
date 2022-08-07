package List.Stack;

import java.util.Iterator;
import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stringStack= new Stack<>();
        stringStack.add("asdfa");
        stringStack.add("ma");
        stringStack.push("faefaf");
        stringStack.add("dar");
        System.out.println(stringStack);
        System.out.println(stringStack.empty());
        Iterator<String> iterator=stringStack.iterator();
       // System.out.println(stringStack.peek());
        while (iterator.hasNext()){
            System.out.println(stringStack.pop());
           // iterator.forEachRemaining(System.out::println);
        }
    }

}
