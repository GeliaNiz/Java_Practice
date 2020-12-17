package practice2526;

public class Item<K,V>{
 private K key;
 private V value;
 private Item<K,V> next;
    Item(K key, V value){
        this.key=key;
        this.value=value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
    public Item<K,V> getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }


    @Override
    public String toString() {
        return "Item{" +
                "key=" + key +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
