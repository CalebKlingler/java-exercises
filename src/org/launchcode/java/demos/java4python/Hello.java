package org.launchcode.java.demos.java4python;
import java.util.Scanner;

/**
 * From "Java for Python Programmers"
 */
public class Hello {
    public static void main(String[] args) {
        String name;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = in.next();

        System.out.println("Hello " + name);
    }
}
