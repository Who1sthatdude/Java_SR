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
    }
}
