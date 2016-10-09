/**
 * @author crkimberley on 09/09/2016.
 */
public class NumberStack<T extends Number> {
    private Node head;
    private int length;

    public NumberStack() {
        head = null;
        length = 0;
    }

    public void push(T number) {
        length++;
        Node newNode = new Node(number);
        if (head == null) {
            head = newNode;
        } else {
            newNode.link = head.link;
        }
        head.link = newNode;
    }

    public T pop() {
        // Should really throw an error when trying to retrieve from an empty queue (...later...)
        if (empty()) {
            System.out.println("!!!ERROR: QUEUE IS EMPTY *** NOTHING TO RETRIEVE *** Integer.MIN_VALUE WILL BE PRINTED!!!");
            return null;
        }
        Node result = head.link;
        if (head == result) {
            head = null;
        } else {
            head.link = result.link;
        }
        length--;
        return (T) result.number;
    }

    public boolean empty() {
        return length == 0;
    }

    public void printList() {
        System.out.println("\n=================================================================");
        if (head != null) {
            printList(head);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("L.Node: " + head.link.number
                    + "  •  R.Node (head): " + head.number
                    + "  •  Length of list = " + length);
        } else {
            System.out.println("EMPTY LIST");
        }
        System.out.println("=================================================================\n");
    }

    // Recursive printing
    public void printList(Node node) {
        System.out.println(node.link);
        if (node.link != head) {
            printList(node.link);
        }
    }

    private static class Node<T> {
        private T number;
        private Node link;

        public Node(T number) {
            this.number = number;
            link = null;
        }

        public String toString() {
            return number + "\tLink: " + link.number;
        }
    }
}
