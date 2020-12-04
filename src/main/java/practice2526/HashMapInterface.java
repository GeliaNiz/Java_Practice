package practice2526;

public interface HashMapInterface<K,V>extends Iterable<Item<K,V>> {
    void add(K key,V value);
    V get(K key);
    V remove(K key);

}
