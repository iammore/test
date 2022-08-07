package Maps;

import java.util.*;

public class BetterMap<K,V> implements Map<K,V> {

    protected List<MyLinearMap<K,V>> maps;

    public BetterMap(int k){
        makeMaps(k);
    }

    protected void makeMaps(int k){
        maps=new ArrayList<MyLinearMap<K,V>>(k);
        for (int i =0;i<k;i++){
            maps.add(new MyLinearMap<K,V>());
        }
    }

    protected MyLinearMap<K,V> chooseMap(Object key){
        int index=0;
        if (key!=null){
            System.out.println(Math.abs(key.hashCode()));
          index=Math.abs(key.hashCode())%maps.size();
            System.out.println(index);
        }
        return maps.get(index);
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

    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

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
