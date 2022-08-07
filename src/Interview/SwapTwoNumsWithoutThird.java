package Interview;

public class SwapTwoNumsWithoutThird {

    public static void main(String[] args) {
        swapNums(2,3,4);
    }

    private static void swapNums(int a, int b, int c) {
      //1. two nums
      /*  i1=i+i1;
        i=i1-i;
        i1=i1-i;
        System.out.println(i+" i1-> "+i1);*/

        //2. three nums
        c=a+b+c;
        a=c-a-b;
        b=c-a-b;
        c=c-a-b;
        System.out.println("a "+a+" b "+b+" c "+c);


    }
}
