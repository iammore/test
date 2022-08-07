package Set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

    public static void main(String[] args) {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(4);
        evenNumbers.add(2);
        evenNumbers.add(5);
        evenNumbers.add(89);
        evenNumbers.add(156);

        System.out.println("ArrayList: " + evenNumbers);

        // Creating a LinkedHashSet from an ArrayList
        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(evenNumbers);
        System.out.println("LinkedHashSet: " + numbers);
    }
}
