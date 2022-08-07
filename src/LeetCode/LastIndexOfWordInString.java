package LeetCode;

import java.util.Arrays;

public class LastIndexOfWordInString {
    public static void main(String[] args) {

        /*
        You can use Quantifiers to specify the number of spaces you want to split on: -

    `+` - Represents 1 or more
    `*` - Represents 0 or more
    `?` - Represents 0 or 1
`{n,m}` - Represents n to m
        */
        String s="   fly me   to   the moon  ";
        String[] str=s.split("\\s");
        int length=str[str.length-1].length();
        System.out.println(length);
        System.out.println(Arrays.toString(str));
        System.out.println(str[str.length-1].length());
     /*   System.out.println(s.trim());
    int ans=s.substring(s.trim().lastIndexOf(' ')).trim().length();
    int res=s.trim().length()-s.trim().lastIndexOf(" ")-1;

        System.out.println(s.trim().length());
        System.out.println(s.trim().lastIndexOf(" "));
       *//* System.out.println(res);

        System.out.println(ans.length());*//*
        System.out.println(ans);*/
        /*System.out.println(s.trim());
        System.out.println(s.trim().lastIndexOf(" ")+1);
        int a=s.trim().length();
        int b=s.trim().lastIndexOf(" ")+1;
        System.out.println(a +" "+b);
        System.out.println(a-b);*/
    }


}
