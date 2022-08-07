package List.Vector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorClass {


    public static void main(String[] args) {
        Vector<Integer> vec=new Vector<>();
        Vector<Integer> vec1=new Vector<>();
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        list.add(45);
        list.add(56);
        list.add(67);
        list.add(78);
        vec.add(12);
        vec.add(23);
        vec.add(34);
        vec.add(45);
        vec.add(56);
        vec.add(67);
        vec.add(78);

        vec1.add(341);
        vec1.add(451);
        vec1.add(561);
        vec1.add(671);
        vec.addAll(vec1);
        System.out.println(vec);
        System.out.println(list);

        Iterator<Integer> iterator=vec.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
           iterator.forEachRemaining(System.out::println);
       }
        System.out.println(vec.removeAll(vec1));
        System.out.println(vec);

    }
}
