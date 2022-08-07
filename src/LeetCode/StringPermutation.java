package LeetCode;

import java.util.Arrays;

public class StringPermutation {


    public static void main(String[] args) {
        System.out.println("main method begins.....");
        boolean ans=permutation("god","dog");
        System.out.println(ans);
        /*String s="ab";
        String t="eidboaoo";
        char[] s1= s.toCharArray();
        Arrays.sort(s1);
        String sf=new String(s1);
        System.out.println(s1);
        char[] t1= t.toCharArray();
        Arrays.sort(t1);
        String tf=new String(t1);
        System.out.println(t1);
        if(tf.contains(sf)){
            System.out.println(true);*/
        }


    static boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] letters = new int[26];
        char[] s_array = s.toCharArray();
        for (char c : s_array) {
            letters[c]++;
            System.out.println(letters[c]+""+c);
            System.out.println(Arrays.toString(letters));
        }
        for (int i = 0; i < t.length(); i++) {
            int c = (int) t.charAt(i);
            letters[c]--;
            if (letters[c] < 0) {
                return false;
            }
        }
        return true;
    }
}
