package List.LinkkeddList;

public class LinkedListMain {


    public static void main(String[] args) {
        MyList<Integer> list=new MyLinkedList<>();

        list.add(0,123);
        list.add(1,456);
       // System.out.println("yeh added wale ka "+list.addWithObject(852));
        int index=0;
        System.out.println("size is "+list.size());
       while(index<list.size()){
           System.out.println("items are "+list.getNodeWithInt(index));
           index++;
       }
        System.out.println(((MyLinkedList<Integer>) list).getNodee(456));
    }
}
