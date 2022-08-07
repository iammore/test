package Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetClass {


    public static void main(String[] args) {
        Set set=new HashSet(8, (float) 0.60);
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        HashSet<Integer> numbersClone = (HashSet<Integer>) numbers.clone();
        System.out.println(numbersClone);
        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);
    }
}
