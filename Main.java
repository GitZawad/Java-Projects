import java.util.Scanner;
class Employee
{
    int salary;
    String name;
    public Employee(int sal)
    {
        salary = sal;
    }
    public Employee()
    {
        salary = 10000;
    }
}
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println(emp.salary);
    }
}