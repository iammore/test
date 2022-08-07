package og;

import java.util.ArrayList;
import java.util.List;

public class ArrMain {


    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(0,"0");
        list.add(1,"1");
        list.add(2,"2");
        list.add(3,"3");
        list.add(4,"4");
        list.add(2,"25");
        list.add(3,"35");

        System.out.println(list.set(3,33));
        System.out.println(list.size());
        System.out.println(list.indexOf(1));
       // list.forEach(System.out::println);
    }
}
