import java.util.Date;

public class GcDemo {
    public static void main(String[] args) throws Throwable {
        Runtime runtime=Runtime.getRuntime();
      GcDemo gcDemo=new GcDemo();
      //gcDemo.finalize();
        gcDemo=null;
      runtime.gc();
        System.out.println("ending main");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("calling finalise");
        System.out.println(10/0);
    }
}
