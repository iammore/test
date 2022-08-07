package Fis;

@FunctionalInterface
public interface FuncInterf {

    public void fi();
    public default void m1(){
        System.out.println("default");
    }

    public static void m2(){
        System.out.println("static method");
    }
}
