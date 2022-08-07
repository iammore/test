package Interview;

import java.util.Arrays;

public class IntegerPalindrome {

    public static void main(String[] args) {
        isPalindrome(12456);
    }

    private static void isPalindrome(int num) {
        //1. convert to string take reverse and equals
        StringBuffer str=new StringBuffer(String.valueOf(num));
        System.out.println(str);
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer=str.reverse();
        System.out.println(stringBuffer);
        if (str.equals(stringBuffer)){
            System.out.println("Palindrome");
        }else System.out.println("Not palindrome");


        //2 by converting to array
        int[] arr=new int[String.valueOf(num).length()];
        int rever=1;
        for (int i=0;i< arr.length;i++){
            arr[i]=num%10;
            rever=rever+(num%10)*10;
            System.out.println("rever is "+rever);
            num=num/10;
            System.out.println(num);
        }
        System.out.println(Arrays.toString(arr));



    }
}
