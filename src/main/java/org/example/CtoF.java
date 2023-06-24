package org.example;
import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusTemp;

        do {
            System.out.print("Enter the temperature(Celsius) = ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input! Enter a valid number!");
                scanner.next();
            }
            celsiusTemp = scanner.nextDouble();
        } while (celsiusTemp < -273.15);

        double fahrTemp = celsiusTemp * 9 / 5 + 32;
        System.out.printf("%.2f°C is equal to %.2f°F.", celsiusTemp, fahrTemp);

        scanner.close();
    }
}
