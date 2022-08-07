public class InheritanceMain {

    public static void main(String[] args) {
        Super superrr=new Sub();
        superrr.show();
        superrr.m1();
        System.out.println("********************super over*****************");
        Sub sub=new Sub();
        sub.m2();
        sub.m1();
        sub.show();
    }
}
