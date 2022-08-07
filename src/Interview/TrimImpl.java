package Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TrimImpl {

    public static void main(String[] args) {
        trimmer("   Mahendra   more   ");

    }

    private static void trimmer(String s) {
        StringBuffer sb=new StringBuffer();
        s.charAt(0);

        List<String> list= Arrays.asList(s.split(" "));
        List<String> list1= list.stream().filter(i->i.length()>0).collect(Collectors.toList());
       String s4=list1.get(0);
        System.out.println(list1);
        String[] arr= s.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(list.get(0));
        if (!s.contains(" ")) return;
        for (int i=0;i<s.length();i++){

        }
    }
}
