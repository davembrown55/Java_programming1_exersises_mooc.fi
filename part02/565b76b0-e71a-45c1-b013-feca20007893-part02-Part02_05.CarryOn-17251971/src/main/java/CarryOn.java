
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shall we carry on?");

        while (true) {

            String carryOn = scanner.nextLine();
            if (carryOn.equals("no")) {
                break;
            }

            System.out.println("Shall we carry on?");

        }

    }
}
