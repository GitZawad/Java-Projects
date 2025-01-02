interface parent{
    void meth1();
}

interface parent2{
    void meth2(int a);
}

public class Main {
    public static void main(String[] args) {
        parent p1 = new parent() {
            @Override
            public void meth1() {
                System.out.println("This is meth1");
            }
        };
        p1.meth1();

        parent2 p2 = (a) -> {
            System.out.println("This is meth "+a);
        };
        p2.meth2(2);
    }

}