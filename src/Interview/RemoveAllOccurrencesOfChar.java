package Interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

public class RemoveAllOccurrencesOfChar {

    public static void main(String[] args) {
        removeOccurrences("abcdABCDabcd");

    }

    private static void removeOccurrences(String str) {

      //1. using string buffer and checking if string contains the char anywhere else
       /* StringBuffer sb=new StringBuffer();
        for (int i=0;i<str.length();i++){
           // System.out.println(sb.indexOf(str.charAt(i)+""));
            if (sb.indexOf(str.charAt(i)+"")<0 && !str.substring(i+1).contains(str.charAt(i)+"")
            && !str.substring(0,i).contains(str.charAt(i)+"")){
                sb.append(str.charAt(i));
                //System.out.println(sb);
            }
        }
        System.out.println(sb);*/

        //2.using hashmap
        Map<Character,Integer> map=new HashMap<>();
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i), 1);
            }

        }
        System.out.println(map);

        for (Map.Entry<Character,Integer> entry : map.entrySet()) //using map.entrySet() for iteration
        {
            if (entry.getValue()<=1){
                sb.append(entry.getKey());
            }
        }
        System.out.println(sb);

    }
}
