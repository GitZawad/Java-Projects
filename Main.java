abstract class pen
{
    abstract void write();
    abstract void refill();
}
class FountainPen extends pen
{
    void write()
    {
        System.out.println("I can write");
    }
    void refill()
    {
        System.out.println("I can refill");
    }
    void changeNib()
    {
        System.out.println("I can change nib");
    }
}
public class Main {
    public static void main(String[] args)

    {
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
    }
}