package AnonymousInner;

public class MyThread extends Thread{

    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("myia thread");
        }
    }
}


class ThreadDemo {
    public static void main(String[] args) {
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("one time use thread");
                }
            } }).start();

        for (int i=0;i<5;i++){
            System.out.println("main thread");
        }
    }
}
