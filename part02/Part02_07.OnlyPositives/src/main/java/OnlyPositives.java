
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
               // System.out.println(num);
                break;
            }
            if (num < 0) {
                System.out.println("Unsuitable number");
                System.out.println("Give a number:");
                continue;
            }
            if (num > 0) {
                int pow2 = num * num;
                System.out.println(pow2);
                
            }
            System.out.println("Give a number:");
        }

    }
}
