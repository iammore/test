package InterfaceInInterface;

public interface IntInInt {

   public  void m1();
    interface innner{
        public void m2();
    }
}
class Test implements IntInInt{
    public static void main(String[] args) {
        new Test().m1();
     //   new Test().m2();
    }

    @Override
     public void m1() {
        System.out.println("INININT method m1");
    }
}