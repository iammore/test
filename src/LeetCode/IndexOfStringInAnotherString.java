package LeetCode;

public class IndexOfStringInAnotherString {
    public int strStr(String haystack, String needle) {
        if(needle==null || haystack==null){
            return 0;
        }else{
            int dest=needle.length();
            for(int i=0;i<haystack.length();i++){
                if(i+dest<=haystack.length()){
                    String origin=haystack.substring(i,i+dest);
                    if(origin.equalsIgnoreCase(needle)){
                        return i;
                    }
                }

            }
            return -1;

        }
    }
}
