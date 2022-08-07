package Fis;

public class DoubleColon {


    public static void main(String[] args) {
      //1.method reference
        //  Runnable r=DoubleColon:: m1;

        //2. anonymous class
      /*  Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("this is anonymous class");
            }
        };*/

        //3. lambda exp
        Runnable r=()->{
            System.out.println("this is lambda");
        };
        Thread t=new Thread(r);
        t.start();
    }

    private static void m1() {
        System.out.println("this is method reference");
    }
}
