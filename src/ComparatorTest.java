/**
 * @author crkimberley on 07/10/2016.
 */
public class ComparatorTest {
    public static void main(String[] args) {
        new ComparatorTest().launch();
    }
    private void launch() {
        Comparator comparator = new Comparator();
        System.out.println(comparator.getMax(13,91));
        System.out.println(comparator.getMax(13.13,91.91));
        System.out.println(comparator.getMax("13","91"));
    }
}
