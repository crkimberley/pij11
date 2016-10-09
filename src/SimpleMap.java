import static java.lang.Math.abs;

/**
 * @author crkimberley on 09/10/2016.
 */
public class SimpleMap<K,V> {
    private static final int MAX = 1000;
    private KeyValuePair[] keyValuePairs;

    public SimpleMap() {
        keyValuePairs = new KeyValuePair[MAX];
        for (int i=0; i<MAX; i++) {
            keyValuePairs[i] = null;
        }
    }

    public void put(K key, V value) {
        KeyValuePair pair = new KeyValuePair(key, value);
        int index = getKeyValuePairsIndex(key);
        if (keyValuePairs[index] == null) {
            keyValuePairs[index] = pair;
        } else {
            System.out.println("Key in map already");
        }
    }

    public V get(K key) {
        int index = getKeyValuePairsIndex(key);
        if (keyValuePairs[index] != null) {
            return (V) keyValuePairs[index].getValue();
        }
        System.out.println("Key not found in map");
        return null;
    }

    public boolean remove(K key) {
        int index = getKeyValuePairsIndex(key);
        if (keyValuePairs[index] != null) {
            keyValuePairs[index] = null;
            return true;
        }
        System.out.println("Key not found in map");
        return false;
    }

    private int getKeyValuePairsIndex(K key) {
        return abs(key.hashCode() % MAX);
    }


}
