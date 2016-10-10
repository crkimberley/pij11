import java.util.ArrayList;
import java.util.List;

/**
 * @author crkimberley on 09/10/2016.
 */
public class HashTableConciseCode<K,V> {
    private static final int MAX = 1000;
    private List<V>[] valueLists;

    public HashTableConciseCode() {
        valueLists = new List[MAX];
        for (int i=0; i < MAX; i++) {
            valueLists[i] = new ArrayList<V>();
        }
    }

    public void put(K key, V value) {
        valueLists[getValueListsIndex(key)].add(value);
    }

    public List<V> get(K key) {
        return valueLists[getValueListsIndex(key)];
    }

    public void remove(K key) {
        valueLists[getValueListsIndex(key)].clear();
    }

    private int getValueListsIndex(K key) {
        return Math.abs(key.hashCode() % MAX);
    }
}