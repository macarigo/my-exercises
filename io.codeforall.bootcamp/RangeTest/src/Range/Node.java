package Range;

// Class to create nodes with the values from Range r
class Node<T> {
    T data;
    Node<T> next;

    // Class constructor to give data and next pointer
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    // Setter and getter methods for Data and Next Pointer
    public void setData(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }
}
