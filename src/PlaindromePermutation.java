import java.util.Arrays;

public class PlaindromePermutation {


    public static void main(String[] args) {
        String input="TactCoa".toLowerCase();
        int[] input_array=new int[128];
        for(char c : input.toCharArray()){
          input_array[c]++;
        }
        int count=0;
        for (int i =0;i<128;i++){
            count=count+ input_array[i]%2;
        }
        System.out.println(count);
    }

}
