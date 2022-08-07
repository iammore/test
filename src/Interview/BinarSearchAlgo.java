package Interview;

import java.io.IOException;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class BinarSearchAlgo {

    public static void main(String[] args) throws ArithmeticException {
        System.out.println("main");
        int arr[]={4,5,7,8,6,9,4,10};
        int n=7;
        System.out.println(MyBinarySearch(arr,n));
    }

    private static int MyBinarySearch(int[] arr, int n) throws ArithmeticException {
        int i = n / 0;

        Arrays.sort(arr);
        int min=0;int max= arr.length;
        int mid=arr.length/2;
        System.out.println(mid);
        while (min<=max){
            if (arr[mid]>n){
                max=mid-1;
            }else if (arr[mid]==n){
               return mid;

            }else {min=mid+1;}
            mid=(min+max)/2;
        }
    return -1;}

  static   class MyException extends Exception{
        @Override
        public String getMessage() {
            return "chutiye kuch toh hagg diya tune";
        }
    }
}
