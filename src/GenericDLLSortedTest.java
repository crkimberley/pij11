/**
 * @author crkimberley on 09/10/2016.
 */
public class GenericDLLSortedTest {
    public static void main(String[] args) {
        new GenericDLLSortedTest().launch();
    }

    private void launch() {
        GenericDLLSorted<Double> doubles = new GenericDLLSorted<Double>();
        doubles.add(77.23);
        doubles.add(44.92);
        doubles.add(23.0);
        doubles.add(55.98);
        doubles.add(55.57);
        doubles.add(55.32);
        doubles.add(11.34);
        doubles.printList();

        GenericDLLSorted<Integer> integers = new GenericDLLSorted<Integer>();
        integers.add(6);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(7);
        integers.add(8);
        integers.add(9);
        integers.printList();
    }
}
