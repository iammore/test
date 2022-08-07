package Interview;

public class FiboWithRecursion {

    public static void main(String[] args) {
        System.out.println();
       // fibbo(3);
        fibbovoid(4);
    }

    private static void fibbovoid(int n) {
        int a=0;
        int b=1;
        int c;
        System.out.print(a+""+b);
        for (int i=2;i<n;i++){
            c=a+b;
            System.out.print(c);
            a=b;
            b=c;
        }
    }

    private static int fibbo(int n) {
        System.out.println(n);
       if (n<=1) return n;
       return fibbo(n-1)+fibbo(n-2);
    }
}
