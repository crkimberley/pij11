/**
 * @author crkimberley on 09/10/2016.
 */
public class KeyValuePair<K,V> {
    private K key;
    private V value;

    public KeyValuePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public V getValue() {
        return value;
    }
}
