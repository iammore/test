package Fis;

import java.util.function.Predicate;

public class PredicateImpl {

    public static void main(String[] args) {
        Predicate<String> p1= s-> s.length()>5;
        System.out.println(p1.test("Mahendra"));

    }
}
