package Fis;

import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;
import java.util.function.IntSupplier;
import java.util.function.ObjIntConsumer;

public class Suppliers {

    public static void main(String[] args) {
      /*  int a=123;
        int b=122;*/
        BiPredicate<Integer,Integer> bp =(a, b)-> (a+b) %2==0;
        //int ans = ( a,  b) -> { return (a + b);};
      //  Suppliers s= Suppliers::m1;   //left side should be functional interface
      //  IntSupplier s=()-> 123;
      //  System.out.println(s.getAsInt());
    }

    public static void m1(){
        System.out.println("this is m1");
    }


}
