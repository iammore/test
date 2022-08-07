package Genral;

import Genral.GetSet;

public class Test {

    public static void main(String[] args) {
test();
    Node node=new Node(1);
    if (node==null){
        System.out.println("node is null");
    }else {
        System.out.println("node is not null");
    }
        System.out.println("return aya bhai mera" +
                "");
    }
GetSet getSet=new GetSet("mahendra","kharghar");



    public static void test() {
       int x=0;
        if(x==0){
            return;
        }

        System.out.println("idk what's going on ");
    }


    static class Node{
    int item;
    Node left,right;
    public Node(int key){
        item=key;
        left=right=null;
    }
    }

}

