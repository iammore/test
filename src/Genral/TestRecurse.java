package Genral;

import java.util.ArrayList;
import java.util.List;

public class TestRecurse {

    public static void main(String[] args) {
        List list= new ArrayList<>();
recurse(10);
    }

static int m=10;
    public static void recurse(int n) {
        if(n>=0){
            System.out.println("m is "+m+ " n is "+n);
          //  m=n-1;
            recurse(--m);
            System.out.println("after first recurse n is " +n+" m is "+m);
            recurse(--n);
        }
    }
}
