
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

        System.out.println("Give a number:");
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());

            if (inp == 0) {
                double ave = (double) total / count;
                System.out.println("Average of the numbers: " + ave);
                             
                break;
            } else {
                total = total + inp;
                count++;
                System.out.println("Give a number:");
                continue;
            }

        }
    }
}
