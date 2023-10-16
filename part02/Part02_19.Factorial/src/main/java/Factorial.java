
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number?");
        int num1 = Integer.valueOf(scanner.nextLine());

        int sum = 1;

        for (int i = 2; i <= num1; i++) {
            sum = sum * i;
        }
        System.out.println("Factorial " + sum);

    }
}
