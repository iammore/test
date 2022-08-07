import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class isPalindrome {


    public static void main(String[] args) {
       //1 number palindrome
        /*int num=12321; int dum=12321;
        int rever=0;
        while (num>0){
            rever=rever*10+(num%10);
            // System.out.println("rever is "+rever);
            num=num/10;
        }
         int[] arr = Integer.toString(x).chars().map(c -> c-'0').toArray();
        int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr[j--]) return false;
        }
        return true;
        System.out.println(rever);
        System.out.println(dum);
        System.out.println(rever==dum);*/


        //2 string palindrome
        String str="mahi";
        StringBuilder sb=new StringBuilder();

        List<String> inner= Stream.of(str).collect(Collectors.toList());

        System.out.println(inner);
        System.out.println(isPali(str));
    }

    public static String isPali(String str){
        int i=0;int j=str.length()-1;
        while (i<=j){
            if (str.charAt(i)!=str.charAt(j)){
                System.out.println("not palindrome");
                return "not palindrome";
            }
            i++;j--;
        }
       return "palindrome";
    }
}
