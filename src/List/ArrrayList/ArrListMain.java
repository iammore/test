package List.ArrrayList;

public class ArrListMain {

    public static void main(String[] args) {
        MyList list= new MyArrayList();
        list.add(0,"0000");
        System.out.println(list.get(0));
        list.add(1,"1");
        list.add(2,"2");
        list.add(3,"3");
        list.add(4,"4");
        list.add(2,"25");
        list.add(3,"35");
        list.add(4,"42");
        /*   list.add(1,"1");
        list.add(2,"2");
        list.add(3,"3");
        list.add(4,"4");
        list.add(2,"25");
        list.add(3,"35");
        list.add(4,"42");
        list.add(2,"252");
        list.add(3,"352");
        list.add(2,"23");
        list.add(3,"33");

        System.out.println(list.set(3,34));
        System.out.println(list.indexOf("1"));*/
        //list.forEach(System.out::println);
    }
}
