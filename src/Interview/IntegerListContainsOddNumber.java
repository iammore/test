package Interview;

import java.util.ArrayList;
import java.util.List;

public class IntegerListContainsOddNumber {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(156);
        list.add(56);
        list.add(88);
        list.add(952);
        list.add(456);
        containsOddNumber(list);
    }

    private static void containsOddNumber(List<Integer> list) {
       int count=(int) list.stream().filter(i->i%2!=0).count();
        System.out.println(list.stream().anyMatch(i->i%2!=0));
        System.out.println(list.stream().count());
        System.out.println(count);
    }
}
