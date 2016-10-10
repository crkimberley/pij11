import java.util.ArrayList;

/**
 * @author crkimberley on 09/10/2016.
 */
public class KeyValueList<K,V> {
    private K key;
    private ArrayList<V> values;

    public KeyValueList(K key) {
        this.key = key;
    }

    public KeyValueList(K key, V value) {
        this.key = key;
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
