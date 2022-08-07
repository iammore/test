package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SameArrays {

    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,2};
        int[] arr1={3,2,5,4,2,1};
        isSame(arr,arr1);
    }

    private static void isSame(int[] arr, int[] arr1) {
        //int array to Integer list
      /*  Integer[] intArr=new Integer[arr.length];
        System.arraycopy(arr,0,intArr,0,arr.length);
        List<Integer> list=new ArrayList<>(Arrays.asList(intArr));*/

        //int array to Integer list using array streams
        List<Integer> list=Arrays.stream(arr).boxed().distinct().sorted().collect(Collectors.toList());
        List<Integer> list1=Arrays.stream(arr1).boxed().distinct().sorted().collect(Collectors.toList());

        System.out.println(list.equals(list1));
        System.out.println(list1);
    }
}
