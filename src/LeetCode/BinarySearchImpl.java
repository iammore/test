package LeetCode;

public class BinarySearchImpl {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,9,10,15};
        int target=100;
        System.out.println(binSearch(arr,target));
    }
public static int binSearch(int[] arr, int target){
    int start=0;int end= 8;
    int num=end;
    int mid=end/2;
   // System.out.println(mid);
    while(start<=end){
        if (mid* mid==num){
        return mid;
        }else if (mid*mid<num){
            System.out.println("arr[mid]<target");
            start=mid;
        }else{
           // System.out.println("arr[mid]>target");
            end=mid;
        }
        mid=(start+end)/2;

    }
    return -1;
}
}
