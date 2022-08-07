package Maps;

import java.util.Map;
import java.util.stream.Stream;

public class MainMap {

    public static void main(String[] args) {
        Map<Integer,Integer> myLinearMap=new MyLinearMap<>();
        myLinearMap.put(1,98);
        myLinearMap.put(2,87);
        myLinearMap.put(3,76);

        BetterMap<Integer,Integer> integerMap=new BetterMap<>(5);
       /* integerMap.chooseMap(546);
        integerMap.chooseMap(546);*/
        BetterMap<String,Integer> StringMap=new BetterMap<>(5);
        StringMap.chooseMap(null);
        StringMap.chooseMap("BhaiMere");

        System.out.println( myLinearMap.put(2,54));
       //Stream.of(myLinearMap).forEach(integerIntegerMap -> integerIntegerMap.get(2));
    }
}
