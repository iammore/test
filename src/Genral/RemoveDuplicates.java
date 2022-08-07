package Genral;

import java.util.Arrays;

public class RemoveDuplicates {


    public static void main(String[] args) {
        int nums[]={0,0,1,1,1,2,3,3,4};
        int res[]=new int[nums.length];
        int length=nums.length;
        //System.out.println(length);
       removeDeuplicates(nums);
        //System.out.println(Arrays.toString(res1));
    }



    public static void removeDeuplicates(int[] nums){
        /*System.out.println(length);
        if (length==0){
            System.out.println("from first");
            return new int[]{nums[length]};
        }
        for (int i =0;i<length-2;i++){
            System.out.println("in for loop");
            if (nums[i]!=nums[length-1]){
                System.out.println(nums[i]);
                System.out.println("nums length "+nums[length-1]);
              res[i]=nums[i];
            }else{
                res[i]=nums[length-1];
            }

        }
        length=length-1;
        return removeDeuplicates(length,nums,res);*/
        int leftPointer = 0;
        int n = nums.length;

        if(n == 0) System.out.println(0);

        for(int rightPointer = 1; rightPointer < n; rightPointer++) {
            System.out.println("entering "+rightPointer);
            if(nums[rightPointer] != nums[leftPointer]) {
                System.out.println("right before "+rightPointer);
                System.out.println("before++ "+leftPointer);
                leftPointer++;
                System.out.println("after ++ "+leftPointer);
                System.out.println("aftter "+rightPointer);
                nums[leftPointer] = nums[rightPointer];
            }
        }

        System.out.println(leftPointer+1);
        System.out.println(Arrays.toString(nums));
    }

    }

