package Interview;

public class CheckForPrime {

    public static void main(String[] args) {
      boolean res=  checkPrime(84);
      if (!res) System.out.println("not prime");
      if (res) System.out.println("prime");
    }

    private static boolean checkPrime(int num) {
        for (int i=2;i<Math.ceil(Math.sqrt(num));i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }


}
