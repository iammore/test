package Fis;

import java.util.concurrent.atomic.AtomicInteger;

@FunctionalInterface
public interface InheritFuncInterf {
    public void m1();
}

@FunctionalInterface
interface b extends InheritFuncInterf{

}

class Test{
    public static void main(String[] args) {
       // InheritFuncInterf f=()->System.out.println("hello from the otherside");
        AtomicInteger n= new AtomicInteger(10);
        Runnable r= ()->{
            for (int i=0;i<10;i++){
                System.out.println("n in thread 1"+ n.getAndIncrement());
                System.out.println("thread in runnable");
            }
        };
        Thread thread=new Thread(r);
        thread.start();
        for (int i=0;i<10;i++){
            System.out.println("main thread "+ n.getAndIncrement());
            System.out.println("main thread");
        }
        //f.m1();
    }
}


//b is also considered as FI as it's extending A so it also contains m1() method implicitely that's why B is FI


