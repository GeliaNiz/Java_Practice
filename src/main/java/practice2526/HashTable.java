package practice2526;

import java.util.ArrayList;
import java.util.Iterator;

public class HashTable<K,V> implements HashMapInterface<K,V> {
    public Item currentItem;
    public int index = 0;
    final int size = 10;
    Item<K, V>[] mass = new Item[size];

    @Override
    public void add(K key, V value) {
        Item<K, V> i = mass[hashFunction(key)];
        if (i == null) {
            mass[hashFunction(key)] = new Item(key, value);
        }else {
            while (i.getNext() != null) {
                i = i.getNext();
            }
            i.setNext(new Item(key, value));
        }
        int j = 0;
        while (mass[j] == null) j++;
        currentItem = mass[j];
        index = j;
    }

    @Override
    public V get(K key) {
        Item<K, V> i = mass[hashFunction(key)];
        if (i == null) {
            return null;
        }
        while (!i.getKey().equals(key)) {
            i = i.getNext();
        }
        return i.getValue();
    }

    @Override
    public V remove(K key) {
        Item<K, V> j = mass[hashFunction(key)];
        Item<K, V> curr;
        if (j == null) return null;
        if (j.getKey().equals(key)) {
            curr = mass[hashFunction(key)];
            mass[hashFunction(key)] = j.getNext();
            return curr.getValue();
        }
        while (!j.getNext().getKey().equals(key)) {
            j = j.getNext();
        }
        curr = j.getNext();
        j.setNext(j.getNext().getNext());
        return curr.getValue();
    }

    public int hashFunction(K key) {
        return key.hashCode() % size;
    }

    private class CustomIterator implements Iterator<Item<K, V>> {
        private K currentIndex;
        private HashTable<K, V> table;

        CustomIterator(HashTable<K, V> table) {
            this.table = table;
        }

        @Override
        public boolean hasNext() {
            if (currentItem != null) {
                if (currentItem.getNext() != null) return true;
                if (index < size - 1) {
                    return mass[index] != null;
                }
            }
            int i = 0;
            while (i < size-1 && mass[i] == null) i++;
            currentItem = mass[i];
            index = i;
            return false;
        }

        @Override
        public Item next() {
            if (currentItem.getNext()!=null){
                return currentItem=currentItem.getNext();
            }
            Item j=mass[index];
            int i=index+1;
            while(i<size-1&&mass[i]==null)i++;
            currentItem=mass[i];
            index=i;
            return  j;
        }


    }
    @Override
    public Iterator<Item<K, V>> iterator() {
        return new CustomIterator(this);
    }
}
