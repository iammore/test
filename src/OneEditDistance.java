import java.util.Arrays;

public class OneEditDistance {

    public static void main(String[] args) {
        int[] charArray=new int[128];
        String input="pale";
        String inpu1="bale";
      /*  if(input.trim().length()== inpu1.trim().length()){
            int count=0;
            for (int i=0;i<input.length();i++){
                if (!(input.charAt(i)==inpu1.charAt(i))){
                    count++;
                    if(count>1){
                        System.out.println("not possible");
                        break;
                    }
                }
                 }System.out.println("possible");
        }
        if(input.trim().length()+1== inpu1.trim().length()){
            int count=0;
            for (int i=0;i<inpu1.length();i++){
                if (!(input.charAt(i)==inpu1.charAt(i))){
                    count++;
                    if(count>1){
                        System.out.println("not possible");
                        break;
                    }
                }
                } System.out.println("possible");
        }
      */
        System.out.println(oneEdit(input,inpu1));
    }


    public static int  oneEdit(String input, String input2){
        int count=0;

            for (int i=0;i< (input.length()<input2.length()?input.length():input2.length());i++){
                if (!(input.charAt(i)==input2.charAt(i))){
                    count++;
                    if(count>1){
                        System.out.println("not possible");
                        return count;
                    }
                }
            }
       return count;
    }
}
