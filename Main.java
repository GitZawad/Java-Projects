import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque q1 = new ArrayDeque();
        q1.add(4);
        q1.add(5);
        q1.addFirst(9);
        q1.addLast(80);

        System.out.println(q1);
        //System.out.println(q1.peek());
        System.out.println(q1.pop());
        System.out.println(q1);
        System.out.println(q1.remove());
    }
}