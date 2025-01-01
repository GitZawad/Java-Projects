//package com.company;
class app{
    public int a = 2;
    protected int b = 3;
    int c = 4;
    private int d = 5;
}
public class Main {
    public static void main(String[] args)
    {
        app c = new app();
        System.out.println(c.a);
        System.out.println(c.b);
        System.out.println(c.c);
        System.out.println(c.d);
    }
}