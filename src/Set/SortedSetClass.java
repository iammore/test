package Set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetClass {
    public static void main(String[] args) {
        SortedSet<String> sortedSet=new TreeSet<>();
        sortedSet.add("ma");
        sortedSet.add("ma");
        sortedSet.add("he");
        sortedSet.add("nd");
        sortedSet.add("ra");
        sortedSet.add("mo");
        sortedSet.add("re");
        System.out.println(sortedSet);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.headSet("ra"));
        System.out.println(sortedSet.tailSet("ma"));
        System.out.println(sortedSet.subSet("ma","ra"));

        //HOW TO USE CHECK IT
        Comparator comparator=sortedSet.comparator();
        System.out.println(comparator.compare(sortedSet.first(),sortedSet.last()));

    }
}
