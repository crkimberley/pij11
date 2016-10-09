/**
 * @author crkimberley on 09/10/2016.
 */
public class NumberStackTest {
    public static void main(String[] args) {
        new NumberStackTest().launch();
    }

    private void launch() {
        NumberStack<Integer> integerNumberStack = new NumberStack<Integer>();
        integerNumberStack.push(37);
        integerNumberStack.push(23);
        integerNumberStack.push(45);
        integerNumberStack.push(99);
        integerNumberStack.push(39);
        integerNumberStack.push(66);
        integerNumberStack.push(47);
        integerNumberStack.push(91);
        integerNumberStack.printList();
        System.out.println(integerNumberStack.pop());
        integerNumberStack.printList();

        NumberStack<Double> doubleNumberStack = new NumberStack<Double>();
        doubleNumberStack.push(3.14);
        doubleNumberStack.push(98.34745);
        doubleNumberStack.printList();
        System.out.println("pop..." + doubleNumberStack.pop());
        doubleNumberStack.printList();
    }
}
