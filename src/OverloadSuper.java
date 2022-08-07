public class OverloadSuper {

    public void show(){
        System.out.println("show 1");
    }
    protected void show(int a){
        System.out.println("show from a "+a);
    }

    private int show(int a, int b){
        System.out.println();
        return 123;
    }

}
