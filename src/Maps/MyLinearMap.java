package Maps;

import java.util.*;

public class MyLinearMap<K,V> implements Map<K,V> {
    private List<Maps.Entry> entries= new ArrayList<>();

    private Maps.Entry findEntry(Object target){
        for (Maps.Entry entry:entries){
            if (equals(target,entry.getKey())){
                return entry;
            }
        }
        return null;
    }

    private boolean equals(Object target, Object key) {
        if (target==null){
            return key==null;
        }
        return target.equals(key);
    }

    public V put(K key, V value){
        Maps.Entry entry=findEntry(key);
        if (entry==null){
            System.out.println("ummm seems like new entry let me add it in the entries arraylist");
            entries.add(new Maps.Entry(key,value));
            return null;
        }
        System.out.println("ummm seems like old entry let me replace it in the entries arraylist");

        V oldvalue= (V) entry.getValue();
        System.out.println(oldvalue);
        System.out.println(value);
        entry.setValue(value);
        return oldvalue;
    }

    public V get(Object key){
        Maps.Entry entry=findEntry(key);
        if (entry==null){
            return null;
        }
        return (V) entry.getValue();
    }

public V remove(Object key){
    Maps.Entry entry=findEntry(key);
    if (entry==null){
        return null;
    }else {
        V value= (V) entry.getValue();
        entries.remove(entry);
        return value;
    }
}






























    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

 /*   @Override
    public V get(Object key) {
        return null;
    }
*/
    /*@Override
    public V put(K key, V value) {
        return null;
    }*/

 /*   @Override
    public V remove(Object key) {
        return null;
    }
*/
    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
