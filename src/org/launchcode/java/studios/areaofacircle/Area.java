package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius = -1.0;
        Scanner scanner = new Scanner(System.in);

        while (radius < 0) {
            System.out.print("Enter a radius: ");
            try {
                radius = Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Enter a number greater than zero");
            }
        }
        double circle = Circle.getArea(radius);
        System.out.println(circle);
    }
}
