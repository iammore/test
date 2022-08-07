package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HashMapClass {

    public static void main(String[] args) {
        HashMap<Integer, String> hashMap=new HashMap<>();
        HashMap<Integer, String> hashMap1=new HashMap<>();
        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"tjhree");
        hashMap.put(4,"four");
        hashMap.put(5,"five");
        hashMap.put(6,"siz");
        hashMap.put(7,"seven");
        hashMap1.put(9,"four");
        hashMap1.put(10,"five");
        hashMap1.put(11,"siz");
        hashMap1.put(12,"seven");
       hashMap1= (HashMap<Integer, String>) hashMap.clone();
    /*    System.out.println("keyset "+hashMap.keySet());
        System.out.println("values "+hashMap.values());
        System.out.println("EntrySet "+hashMap.entrySet());
        System.out.println(hashMap.remove(2,"two"));
        System.out.println(hashMap.putIfAbsent(8,"eighty"));
        System.out.println(hashMap1);
        hashMap.putAll(hashMap1);
        System.out.println(hashMap);*/
        //compute-> computes a new value and associates it with the specified key in the hashmap.
        hashMap.compute(1,(key,value)->"key "+value);
        //compute-> computes a new value and associates it with the specified key in the hashmap if key is present if absent literally does nothing.
        hashMap.computeIfPresent(7,(key,value)-> " bhai bhai bhai");
        //compute-> computes a new value and associates it with the specified key in the hashmap if key is not present if present then does nothing literally.
      // hashMap.computeIfAbsent(8,(old)->old+" it's a new one");
        hashMap.computeIfAbsent(8,(old)->old+" afweeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeaggggggggsdagweeegadhaone");
        hashMap.merge(6,hashMap.get(6),(oldVal,NewVal)-> oldVal+ " NewVal");
        hashMap.forEach((key,value)->hashMap.merge(key,value,(old,newV)->old+"/ "+"puck"));
        System.out.println(hashMap);
        System.out.println(hashMap1);

    }



}
