
class A
{
/*    int x = 10;
    public void assign(int x)
    {
        x = x;
        System.out.println(this.x);
    }
    public static void main(String[] args)
    {
        new A().assign(100);
    }*/

    public void m1()
    { System.out.println("A"); }
}
 class B extends A
{
    public void m1()
    { System.out.println("B"); }

    public static void main(String []args)
    {
        A a = new B();
        a.m1();
    }
}