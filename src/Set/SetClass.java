package Set;

import java.util.HashSet;
import java.util.Set;

public class SetClass {

    public static void main(String[] args) {
        Set set=new HashSet();
        Set set1=new HashSet();
        set.add("ma");
        set.add("he");
        set.add("nd");
        set.add("ra");
        set.add("mo");
        set.add("re");

        set1.add("nd");
        set1.add("ra");
        set1.add("mo");



        //set.addAll(set1);
        System.out.println(set);
        System.out.println(set1);
        System.out.println(set.containsAll(set1));
        System.out.println(set);
        System.out.println(set1);
    }

}
