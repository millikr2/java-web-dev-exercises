package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles?");
        int miles = Integer.parseInt(scanner.nextLine());

        System.out.println("How many gallons?");
        int gallons = Integer.parseInt(scanner.nextLine());
        scanner.close();

        int mpg = miles/gallons;
        System.out.println("Your mpg is " + mpg);
    }
}
