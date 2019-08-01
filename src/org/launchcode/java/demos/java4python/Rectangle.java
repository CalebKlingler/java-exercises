package org.launchcode.java.demos.java4python;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        double width;
        double length;
        double area;
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        width = in.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        length = in. nextDouble();
        area = width * length;
        System.out.println("The are of the rectangle is " + area);

    }
}
