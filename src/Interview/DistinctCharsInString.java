package Interview;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctCharsInString {

    public static void main(String[] args) {
        findDistinctChar("abcdABCDabcd");
    }

    private static void findDistinctChar(String str) {
        //1. using charArray and intArray of ASCII values
       /* int[] intArr=new int[127];
        char[] charArr=str.toCharArray();
        for (char ch:charArr){
            intArr[ch]++;
        }
      //  System.out.println(Arrays.toString(intArr));
        StringBuffer sb=new StringBuffer();
        for (int i=0;i<str.length(); i++){
            if (sb.indexOf(str.charAt(i)+"")<0){
                sb.append(str.charAt(i)+"-"+intArr[str.charAt(i)]+",");
            }

        }
        System.out.println(sb);*/
        //2. using hashmap
        Map<Character, Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            if (map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else
                map.put(str.charAt(i),1);
        }
        System.out.println(map);
    }
}
