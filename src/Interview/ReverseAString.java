package Interview;

import java.util.Arrays;

public class ReverseAString {


    public static void main(String[] args) {
        String str="mahendra";
        reverseString(str);
    }

    private static void reverseString(String str) {
        //1. print it backwords
      /*  String reversed="";
        for (int i=str.length()-1;i>=0;i--){
            reversed+=str.charAt(i);
        }
        System.out.println(reversed);*/

        //2.maybe substring----this doesn't work
      /*  String rvrsed=str.substring(str.length()-1,0);
        System.out.println(rvrsed);*/

        //3. charArray
       /* char[] arr=new char[str.length()];
        int j=0;
        for (int i=str.length()-1;i>=0;i--){
            arr[j++]=str.charAt(i);
        }
        System.out.println(String.valueOf(arr));*/

        //4. String buffer or builder
        StringBuffer stringBuffer=new StringBuffer();
      //  System.out.println(stringBuffer.reverse());
        for (int i=str.length()-1;i>=0;i--){
            stringBuffer.append(str.charAt(i));
        }
        System.out.println(stringBuffer);
    }
}
