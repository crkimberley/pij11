import java.util.Collections;

/**
 * @author crkimberley on 08/10/2016.
 */
public class GenericDLLSorted<T extends Number> extends GenericDLL<T> {

    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        // If empty list - point left to new Node
        if (right == null) {
            left = newNode;
            right = newNode;
        } else {
            Node<T> temp = new Node<T>();
            temp.next = left;
            // Find place for new Node in list
            while (temp != right && temp.next.value.longValue() < newNode.value.longValue()) {
                temp = temp.next;
            }
            // Update right pointer if Node is inserted at right end
            if (temp == right) {
                right = newNode;
            }
            // Update left pointer if Node is inserted at left end
            if (temp.next == left) {
                left = newNode;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
}