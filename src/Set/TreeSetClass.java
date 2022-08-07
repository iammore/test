package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetClass {

    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet();

        treeSet.add(789);
        treeSet.add(753);
        treeSet.add(159);
        treeSet.add(852);
        treeSet.add(123);
        treeSet.add(456);
        treeSet.add(741);
        System.out.println(treeSet);

        System.out.println(treeSet.subSet(740,852));
    }

}
