public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(7);
        list.add(8);
        list.add(13);
        list.remove(1);
        list.set(1, 10);
        System.out.println(list.get(1));
        System.out.println(list.contains(7));
        LinkedQueue<Integer> queue = new LinkedQueue<>();
        queue.add(55);
        queue.add(78);
        queue.add(32);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.isEmpty());
        LinkedStack<Integer> stack = new LinkedStack<>();
        stack.push(228);
        stack.push(322);
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
