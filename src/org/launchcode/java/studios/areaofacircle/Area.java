package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a radius.");
        int radius = myScanner.nextInt();
        double circleArea = Circle.getArea((double) radius);
        System.out.println("The area of a circle of radius " + radius
                + " is " + circleArea + "." );
    }
}


