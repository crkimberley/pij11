import java.util.ArrayList;
import java.util.List;

/**
 * @author crkimberley on 09/10/2016.
 */
public class HashTable<K,V> {
    private static final int MAX = 1000;
    private List<V>[] valueLists;

    public HashTable() {
        valueLists = new List[MAX];
        for (List list : valueLists) {
            list = null;
        }
    }

    public void put(K key, V value) {
        int index = getValueListsIndex(key);
        if (valueLists[index] == null) {
            valueLists[index] = new ArrayList<V>();
            valueLists[index].add(value);
        } else {
            valueLists[index].add(value);
        }
    }

    public List<V> get(K key) {
        int index = getValueListsIndex(key);
        if (valueLists[index] != null) {
            return valueLists[index];
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
        return Math.abs(key.hashCode() % MAX);
    }
}