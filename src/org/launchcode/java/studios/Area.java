package org.launchcode.java.studios;

import java.util.Scanner;


public class Area {    public static void main(String[] args){
    double radius;
    double area;
    Scanner in;
    in = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    radius = in.nextDouble();
    while (radius < 0){
        System.out.println("No negative numbers allowed! Enter the radius of the circle: ");
        radius= in.nextDouble();

    }

    area = Math.PI * radius * radius;
    System.out.println("The area of the circle is " + area);

}
}
