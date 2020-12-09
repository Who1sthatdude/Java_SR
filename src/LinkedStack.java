public class LinkedStack<T> implements Stack<T> {
    private Node<T> head;
    private int size;

    static class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T item) {
            value = item;
            next = null;
        }
    }

    public LinkedStack() {
        head = null;
        size = 0;
    }


    @Override
    public void push(T element) {
        Node<T> node = new Node<>(element);
        if (head != null) {
            node.next = head;
        }
        head = node;
        size++;
    }

    @Override
    public T pop() {
        T ret = head.value;
        head = head.next;
        size--;
        return ret;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
