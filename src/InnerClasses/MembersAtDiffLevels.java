package InnerClasses;

public class MembersAtDiffLevels {

           public  void m1(){
            int z=10;
          class deepIn{
              public void sum(){
                  System.out.println(z);

              }
          }

          deepIn deepIn=new deepIn();
          deepIn.sum();

    }

    public void m2(){
               m1();
    }

    public static void main(String[] args) {
        new MembersAtDiffLevels().m2();
    }
}
