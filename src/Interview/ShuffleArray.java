package Interview;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] arr={1,2,4,1,9,5,32,75};
        shuffleIt(arr);
    }

    private static void shuffleIt(int[] arr) {
        Random random=new Random();
        for (int i=0;i< arr.length;i++){
            int ra=(int) (Math.random() * ((arr.length) - 0 ));
            int r = random.nextInt(arr.length);
            System.out.println(ra);
        }


    }
}
