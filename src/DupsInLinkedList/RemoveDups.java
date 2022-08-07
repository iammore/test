package DupsInLinkedList;

import java.util.Arrays;
import java.util.Collections;

public class RemoveDups {

    public static void main(String[] args) {
        String [] words = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for(String str:words){
            if(str.length()==1) return str;
            int j=str.length()-1;
            int i=0;
            for(i=0; i<=j;i++){
                System.out.println("i "+str.charAt(i));
                System.out.println("j "+str.charAt(j));
                if(str.charAt(i)!=str.charAt(j--)){
                    break;
                }
                if(i>=j){
                    return str;
                }

            }
        }
        return "";   }
}
