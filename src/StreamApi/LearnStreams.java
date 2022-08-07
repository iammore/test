package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//when you import a package all classses and interfaces are imported from that pkg but not subpackage that's why even
//if you do import java.util.* you;ll hvae to do below
import java.util.stream.Stream;

public class LearnStreams {



    public static void main(String[] args) {
        var x=10;
        List<String> list=new ArrayList<>();
        list.add("mahendra"); list.add("adim"); list.add("abob"); list.add("praj"); list.add("adi");
        System.out.println(list);
    //  List<String> list1= list.stream().filter( i->i%2==0).collect(Collectors.toList());
      //  System.out.println(list1);
       // List<String> list2=list.stream().map(i->i+5).collect(Collectors.toList());

        //this for descending order
      //  List<Integer> sortedList=list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());

        //or this for descending easily use - symbol to reverse
        List<String> sortedList1=list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("sorted list is: "+sortedList1);


  //or this for descending easily use reverse i1 i2 for descending order
        List<String> sortedList2=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("sorted list is: "+sortedList2);

//sort according to length and if length is same sort according to natural order that is alphabetical order which is taken care of by default
        Comparator<String> comparator=(s1,s2)->{
            int l1=s1.length();
            int l2=s2.length();
            if (l1<l2) return -1;
            else if(l1>l2) return 1;
            else return s1.compareTo(s2);
        };
        List<String> sortedList3=list.stream().sorted(comparator).collect(Collectors.toList());

        System.out.println("sorted list3 is: "+sortedList3);

        list.forEach(System.out::println);
      //  List<Integer> chhoti=list.stream().filter(i ->i<654 ).collect(Collectors.toList());
     //   System.out.println(list2);
      // System.out.println("sorted list is: "+sortedList);
      //  System.out.println("chhoti list is: "+chhoti);
      //  System.out.println("chhoti list count is: "+list.stream().filter(i->i<700).count());
    }

}
