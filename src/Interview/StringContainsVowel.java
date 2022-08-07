package Interview;

import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringContainsVowel {

    public static void main(String[] args) {
        StringHasVowel("mndr");
    }

    private static void StringHasVowel(String str) {

      //1. traverse to check
      /*  for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='o' ||str.charAt(i)=='i' ||str.charAt(i)=='u')
                System.out.println("contains vowel "+str.charAt(i));
        }*/

        //2. use regex
        if (str.matches(".*[a-z, A-Z].*")){
            System.out.println("contains vowels");
        }else System.out.println("doesn't contain vowels");

       Stream<String> stream= Stream.of(str);
        System.out.println(stream.collect(Collectors.toList()));
    }
}
