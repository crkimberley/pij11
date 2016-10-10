import java.util.ArrayList;

import static java.lang.Math.abs;

/**
 * @author crkimberley on 09/10/2016.
 */
public class HashTable<K,V> {
    private static final int MAX = 1000;
    private KeyValueList[] keyValueLists;

    public HashTable() {
        keyValueLists = new KeyValueList[MAX];
        for (int i=0; i<MAX; i++) {
            keyValueLists[i] = null;
        }
    }

    public void put(K key, V value) {
        int index = getKeyValueListsIndex(key);
        if (keyValueLists[index] == null) {
            keyValueLists[index] = new KeyValueList(key, value);
        } else {
            keyValueLists[index].addValue(value);
        }
    }

    public ArrayList<V> get(K key) {
        int index = getKeyValueListsIndex(key);
        if (keyValueLists[index] != null) {
            return keyValueLists[index].getValues();
        }
        System.out.println("Key not found in map");
        return null;
    }

    public boolean remove(K key) {
        int index = getKeyValueListsIndex(key);
        if (keyValueLists[index] != null) {
            keyValueLists[index] = null;
            return true;
        }
        System.out.println("Key not found in map");
        return false;
    }

    private int getKeyValueListsIndex(K key) {
        return abs(key.hashCode() % MAX);
    }


}
