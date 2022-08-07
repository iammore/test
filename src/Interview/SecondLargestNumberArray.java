package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class SecondLargestNumberArray {

    public static void main(String[] args) {
        int[] nums={1,7,2,86,35,596,785,21};
        findSecondLargest(nums);
    }

    private static void findSecondLargest(int[] nums) {
      /*  Queue<Integer> set= new PriorityQueue<>();
        for (int i:nums){
            set.add(i);
        }
       for (int i=0;i< nums.length;i++){
           System.out.println(set.remove());

       }*/

        List<Integer> list=new ArrayList<>();
        for (int i:nums){
            list.add(i);
        }
        System.out.println(list);
        List<Integer> Sortedlist= list.stream().sorted((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0).collect(Collectors.toList());
        System.out.println(Sortedlist.get(1));
    }
}
