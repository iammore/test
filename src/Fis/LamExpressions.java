package Fis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    int num;
    public Employee(String name,int num){
        this.name=name;
        this.num=num;
    }

    public String toString(){
        return name+" : "+num;
    }
}

public class LamExpressions {

    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
        list.add(new Employee("mahendra",123));
        list.add(new Employee("abc",25));
        list.add(new Employee("bcd",598));
        list.add(new Employee("efg",153));
        System.out.println("mahendra".compareTo("mahi"));
      //  Comparator<Employee> c= (i1,i2)->(i1.num<i2.num)?-1:(i1.num>i2.num)?1:0;
        Comparator<Employee> c=(i1,i2)-> i2.name.compareTo(i1.name);
        System.out.println(c.compare(list.get(1),list.get(3)));
       Collections.sort(list,c);
        System.out.println(list);
    }
}
