/**
 * @author crkimberley on 09/09/2016.
 */
// Left & Right pointer variables used - as in FoC notes
public class GenericDLL<T> {
    private Node left, right;
    private int length;

    public GenericDLL() {
        left = null;
        right = null;
        length = 0;
    }

    public void add(T value) {
        Node newNode = new Node(value);
        newNode.previous = right;
        newNode.next = null;
        // If empty list - point left to new Node
        if (right == null) {
            left = newNode;
        } else {
            right.next = newNode;
        }
        right = newNode;
        length++;
    }

    public boolean delete(T value) {
        boolean found = false;
        if (left != null) {
            // Special case: value to delete - 1st in list
            if (left.value.equals(value)) {
                found = true;
                left = left.next;
                if (left != null) {
                    left.previous = null;
                } else {
                    right = null;
                }
            } else {
                // Go through list until a match is found
                Node temp = left;
                while (!found && temp != right) {
                    if (temp.next.value.equals(value)) {
                        found = true;
                        temp.next = temp.next.next;
                        if (temp.next != null) {
                            temp.next.previous = temp;
                        } else {
                            right = temp;
                        }
                    }
                    temp = temp.next;
                }
            }
        }
        System.out.println(found ? "DELETED" : "NOT IN THE LIST");
        if (found) {
            length--;
        }
        return found;
    }

    public void printList() {
        Node temp = left;
        System.out.println();
        while (temp != null) {
            System.out.print(temp);
            temp = temp.next;
            System.out.print(temp != null ? " • " : "\n");
        }
    }

    public int getLength() {
        return length;
    }
    
    private static class Node<T> {
        private T value;
        private Node next;
        private Node previous;

        public Node(T value) {
            this.value = value;
            next = null;
            previous = null;
        }

        public String toString() {
            return "" + value;
        }
    }
}
