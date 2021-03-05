package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args)  {


        try {
            Class cls = Class.forName("com.company.example1");
            example1 obj1 = (example1) cls.newInstance();
            System.out.println(obj1.exss());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class example1  {

    Scanner sc = new Scanner(System.in);
    private int x = sc.nextInt();
    private int y = sc.nextInt();

    public int exss() {
        int i = x * y;
        return i;
    }

}
