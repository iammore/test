package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UrlifyString {

    public static void main(String[] args) {


        String input="Mr John Smith       ";
      //  int[] table = buildCharFrequencyTable(input);
        System.out.println(input.length());
        List<String> list=new ArrayList<>();
        for (int i=0;i<input.trim().length();i++){
            if (input.charAt(i) == ' '){
                list.add("%");
                list.add("2");
                list.add("0");
            }else {
                list.add(input.charAt(i)+"");
            }

        }
        List<String> list2= Arrays.asList("A", "B", "C");

        char[] inputArray=input.trim().toCharArray();
        /*
        System.out.println(input.trim().length());
        String finalString=input.trim().replace(" ","%20");
        System.out.println(finalString);*/
        System.out.println(String.join("",list));
        System.out.println('"'+input+'"');


    }


}
