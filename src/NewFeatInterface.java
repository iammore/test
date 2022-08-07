public interface NewFeatInterface {

    public void m1();
    public default void m2(){
        System.out.println(":this is m2");
    }
}


class sebo implements NewFeatInterface{
    @Override
    public void m1() {
        System.out.println("from sebo");
    }
}

class suba implements NewFeatInterface{
    @Override
    public void m1() {
        System.out.println("from sub");
    }
    public void m2(){
        System.out.println("suba");
    }
}

class mainya {
    public static void main(String[] args) {
        NewFeatInterface f=new sebo();
        f.m1();
        f.m2();
        suba s=new suba();
        s.m2();
        s.m1();
    }
}
