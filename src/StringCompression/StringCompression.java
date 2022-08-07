package StringCompression;

import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args) {
        String input="aabbbcccccddaaaaeeeeeeeeeeeeeeeeeeeeeee";
        char[] char_array=input.toCharArray();
        String finalString=input.charAt(0)+"";
        char_array[0]=char_array[0];
        int count=1;
        int index=1;
        for (int i=1;i<input.length();i++){
            if (input.charAt(i)==input.charAt(i-1)){
                count++;
            }else {
                finalString+=count;
                String counts=String.valueOf(count);
                for (int k=0;k<counts.length();k++){
                    char_array[index++]=counts.charAt(k);
                }

                finalString+=input.charAt(i);
                char_array[index++]=input.charAt(i);
                count=1;
            }

        }
        if (count>1){
            finalString+=count;
            String counts=String.valueOf(count);
            for (int k=0;k<counts.length();k++){
                char_array[index++]=counts.charAt(k);
            }

        }

        System.out.println(Arrays.toString(char_array));

      //  char_array=finalString.toCharArray();
        System.out.println(Arrays.toString(char_array));
        System.out.println(finalString);  }
}
