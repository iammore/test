public class Gc2 {

   static int count=0;

    public static void main(String[] args) {
        for (int i =0;i<1000000;i++){
            Gc2 gc2=new Gc2();
            gc2=null;
        }
        //System.gc();
    }

    public void finalize(){
        count++;
        System.out.println("finlaise called"+count);
    }
}
