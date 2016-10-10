import java.util.ArrayList;

import static java.lang.Math.abs;

/**
 * @author crkimberley on 09/10/2016.
 */
public class HashTable<K,V> {
    private static final int MAX = 1000;
    private ValueList[] valueLists;

    public HashTable() {
        valueLists = new ValueList[MAX];
        for (int i=0; i<MAX; i++) {
            valueLists[i] = null;
        }
    }

    public void put(K key, V value) {
        int index = getValueListsIndex(key);
        if (valueLists[index] == null) {
            valueLists[index] = new ValueList(value);
        } else {
            valueLists[index].addValue(value);
        }
    }

    public ArrayList<V> get(K key) {
        int index = getValueListsIndex(key);
        if (valueLists[index] != null) {
            return valueLists[index].getValues();
        }
        System.out.println("Key not found in map");
        return null;
    }

    public boolean remove(K key) {
        int index = getValueListsIndex(key);
        if (valueLists[index] != null) {
            valueLists[index] = null;
            return true;
        }
        System.out.println("Key not found in map");
        return false;
    }

    private int getValueListsIndex(K key) {
        return abs(key.hashCode() % MAX);
    }

    private static class ValueList<V> {
        private ArrayList<V> values;

        public ValueList(V value) {
            values = new ArrayList<V>();
            values.add(value);
        }

        public void addValue(V value) {
            values.add(value);
        }

        public ArrayList<V> getValues() {
            return values;
        }
    }
}
