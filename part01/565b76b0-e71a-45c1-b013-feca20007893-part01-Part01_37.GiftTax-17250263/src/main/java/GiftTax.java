
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a year:");
        double gift = Double.valueOf(scanner.nextLine());
        
        if (gift >= 5000 && gift <= 25000) {
            double tax = (gift - 5000) * 0.08 + 100;
            System.out.println("Tax: " + tax);
        } else if (gift >= 25000 && gift <= 55000) {
            double tax = (gift - 25000) * 0.10 + 1700;
            System.out.println("Tax: " + tax);
        } else if (gift >= 55000 && gift <= 200000) {
            double tax = (gift - 55000) * 0.12 + 4700;
            System.out.println("Tax: " + tax);
        } else if (gift >= 200000 && gift <= 1000000) {
            double tax = (gift - 200000) * 0.15 + 22100;
            System.out.println("Tax: " + tax);
        } else if (gift > 1000000) {
            double tax = (gift - 1000000) * 0.17 + 142100;
            System.out.println("Tax: " + tax);
        } else {
            System.out.println("No tax!");
        }

    }
} 
