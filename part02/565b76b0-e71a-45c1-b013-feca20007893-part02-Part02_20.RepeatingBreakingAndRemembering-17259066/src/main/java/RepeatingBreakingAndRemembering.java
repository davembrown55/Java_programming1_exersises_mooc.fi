
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int sum = 0;
        int numof = 0;
        double ave = 0;
        int even = 0;
        int odd = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == -1) {
                System.out.println("Thx! Bye");
                break;
            } else if (num % 2 == 0) {
                sum = sum + num;
                numof++;
                even++;
                continue;
            } else {
                sum = sum + num;
                numof++;
                odd++;
                continue;
            }
        }
        ave = (double) sum / numof;
        System.out.println("Sum: " + sum + "\nNumbers: " + numof + "\nAverage: "
                + ave + "\nEven: " + even + "\nOdd: " + odd);
    }
}
