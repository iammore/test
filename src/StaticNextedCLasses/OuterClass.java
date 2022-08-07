package StaticNextedCLasses;

public class OuterClass {
static int x=10;
  static  class  Nested{
        public void m1(){
            System.out.println("inside nested class m1");
        }
    }

    public static void main(String[] args) {
        Nested nested=new Nested();
        System.out.println(x);
nested.m1();
    }
}

class Runn{
    public static void main(String[] args) {
      /*  OuterClass.Nested nested=new OuterClass.Nested();
        nested.m1();*/
    }
}
