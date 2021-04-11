public class Node<T> implements INode<T> {
    private  T key;
    private  Node<T> next;

    public Node(T key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = (Node<T>) next;
    }
}
