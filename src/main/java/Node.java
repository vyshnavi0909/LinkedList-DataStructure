public class Node<T> {
    private  T key;
    private  Node next;

    public Node(T key) {
        this.key = null;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
