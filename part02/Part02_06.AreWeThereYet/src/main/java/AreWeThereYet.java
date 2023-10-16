
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());
            if (num == 4) {
               // System.out.println(num);
                break;
            }
            //System.out.println(num);
            System.out.println("Give an number:");

        }

    }
}
