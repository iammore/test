public class Super {

    public void show(){
        System.out.println("from super class");
    }

    public void m1(){
        System.out.println("from super m1");
    }
}


class Sub extends Super{

    int var=2;
    int Var=2147483647;

    public void show(){
        System.out.println("from sub class");
        System.out.println(var);
        System.out.println(Var);
    }

    public void m2(){
        System.out.println("m2 of ssub class");
    }
}