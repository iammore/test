public class OverRSuper {
    public void show(){
        System.out.println("show from super");
    }

    public static void main(String[] args) {
        OverRSuper overRSuper=new OverRSuper();
        overRSuper.show();

        OverRSub overRSub=new OverRSub();
        overRSub.disp();
    }
}


class OverRSub extends OverRSuper{

    public void show(){
        System.out.println("show from sub");
            }

    void disp(){
        System.out.println("disp of subclass");
    }
    //the main reason why overridden methods can't be more restricted is coz
    //sub class methods should be accessible wherever you are want to use the super class object since sub class should be served
    //as replacement of super class so if u try to create an object of some sub class taking reference from parent class but you made
    //the overridden method as private then you won't be able to access it with parent class reference;

    //the imp point why you can create a parent reference and child object is that you can assign and reassign this parent
    //reference to any child any time without mch hassle

}