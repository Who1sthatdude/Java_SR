public class LinkedQueue<T> implements Queue<T> {
    Node<T> head;
    int size;

    static class Node<T> {
        public T value;
        public Node<T> next;

        public Node(T item) {
            value = item;
            next = null;
        }
    }

    public LinkedQueue(){
        head = null;
        size = 0;
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param element the element to add
     */
    public void add(T element) {
            Node<T> newNode = new Node<>(element);
            if (head == null) {
                head = newNode;
            } else {
                Node<T> current = this.head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }


    /**
     * Retrieves and removes queue head.
     *
     * @return an element that was retrieved from the head or null if queue is empty
     */
    public T poll() {
        if (head != null) {
            T ret = head.value;
            head = head.next;
            size--;
            return ret;
        }
        return null;
    }

    /**
     * Returns a size of the queue.
     *
     * @return an integer value that is a size of queue
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return {@code true} if the queue is empty, returns {@code false} if it's not
     */
    public boolean isEmpty() {
        return size==0;
    }
}
