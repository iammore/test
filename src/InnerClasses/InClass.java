package InnerClasses;

public class InClass {

int x=10;
static int y=20;


    static class inner{
         public static void main(String[] args) {
             System.out.println("main method from inner");

         }
     public void m1(){
         System.out.println(new InClass().x);
         System.out.println(y);
     }
    }


}
