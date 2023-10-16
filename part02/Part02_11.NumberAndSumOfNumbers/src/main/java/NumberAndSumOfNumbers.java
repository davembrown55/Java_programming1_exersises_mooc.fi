
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int sum = 0;

        System.out.println("Give a number:");
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());

            if (inp == 0) {
                System.out.println("Number of numbers: " + sum);
                System.out.println("Sum of the numbers: " + total);                
                break;
            } else {
                total = total + inp;
                sum = sum + 1;
                System.out.println("Give a number:");
                continue;
            }

        }
    }
}
