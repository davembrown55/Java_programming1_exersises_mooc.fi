
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        System.out.println("Give a number:");
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());

            if (inp == 0) {
                System.out.println("Sum of the numbers: " + total);
                break;
            } else {
                total = total + inp;
                System.out.println("Give a number:");
                continue;
            }

        }
    }
}
