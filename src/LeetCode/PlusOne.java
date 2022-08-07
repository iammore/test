package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {
        int[] digits={9,9,9};
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                System.out.println(digits);//return
            }
            digits[i]=0;
        }
        int[] newArr=new int[n+1];
        newArr[0]=1;
        System.out.println(newArr);//return

    }


}
