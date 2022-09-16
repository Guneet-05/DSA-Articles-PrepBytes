public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        
        System.out.println("The size of the Linked List is " + list.size());
        
        System.out.println("The element present at index 0 is " + list.get(0));
        
        list.add(0,10);
        System.out.print(list);
    }
}
