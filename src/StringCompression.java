import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static void main(String[] args) {
        String input = "aabbbcccccd";
        int[] input_array = new int[input.length()];
        Map<Character, Integer> map=new HashMap<>();

        for (int i = 0; i < input_array.length; i++) {
            input_array[i] = input.charAt(i);
            map.put(input.charAt(i),0);
            if(map.get(input.charAt(i))>0){
                map.replace(input.charAt(i), map.get(input.charAt(i)+1));
                System.out.println("sfsf"+map.get(input.charAt(i)));
            }else {
                map.put(input.charAt(i),0);
                System.out.println(map.get(input.charAt(i)));
            }
        }
        System.out.println(map);
    }
}
