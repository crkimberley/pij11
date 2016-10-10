/**
 * @author crkimberley on 10/10/2016.
 */
public class HashTableTest {
    public static void main(String[] args) {
        new HashTableTest().launch();
    }

    private void launch() {
        HashTable<Integer, String> table = new HashTable<Integer, String>();
        table.put(13, "Ringo");
        table.put(13, "George");
        table.put(27, "Noel");
        table.put(27, "Liam");
        System.out.println(table.get(13));
        System.out.println(table.get(27));
        System.out.println(table.get(13));
        table.put(1013, "John");
        table.put(1013, "Paul");
        System.out.println(table.get(13));
        table.remove(13);
        System.out.println(table.get(13));

        HashTable<String, Double> table2 = new HashTable<String, Double>();
        table2.put("Potato", 39.267);
        table2.put("Potato", 783.349);
        table2.put("Carrot", 978.2);
        table2.put("Carrot", 978.3);
        table2.put("Carrot", 978.4);
        table2.put("Carrot", 978.5);
        System.out.println(table2.get("Potato"));
        System.out.println(table2.get("Carrot"));

        HashTableConciseCode<Integer, String> table3 = new HashTableConciseCode<Integer, String>();
        table3.put(10, "red");
        table3.put(10, "yellow");
        table3.put(30, "north");
        table3.put(30, "west");
        System.out.println(table3.get(10));
        System.out.println(table3.get(30));
        table3.remove(30);
        System.out.println(table3.get(30));
        System.out.println(table3.get(10));
    }
}
