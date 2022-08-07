package Interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

public class SortArray {

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{5,8,1,2,7,3,1};
        sortArray(arr);
    }

    private static void sortArray(Integer[] arr) {
        Comparator<Integer> c=(i1, i2)->(i1<i2)?-1:(i1>i2)?1:0;
        Collections.sort(Arrays.asList(arr),c);
        System.out.println(Arrays.toString(arr));
    }
}
