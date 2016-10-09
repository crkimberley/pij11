/**
 * @author crkimberley on 10/10/2016.
 */
public class SimpleMapTest {
    public static void main(String[] args) {
        new SimpleMapTest().launch();
    }

    private void launch() {
        SimpleMap<Integer, String> map = new SimpleMap<Integer, String>();
        map.put(31, "potato");
        map.put(119, "donkey");
        System.out.println(map.get(31));
        System.out.println(map.get(119));
        map.put(31, "mustard");
        System.out.println(map.get(72));
        System.out.println(map.remove(99));

        SimpleMap<String, Double> map2 = new SimpleMap<String, Double>();
        map2.put("fred", 87.2);
        map2.put("bertha", 91.6);
        System.out.println(map2.get("fred"));
        map2.remove("bertha");
        map2.remove("derek");
    }
}
