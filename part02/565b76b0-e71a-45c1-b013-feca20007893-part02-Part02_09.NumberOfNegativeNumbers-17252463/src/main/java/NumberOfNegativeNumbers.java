
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int negNums = 0;
        
        System.out.println("Give a number:");
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp == 0) {
                System.out.println("Number of negative numbers: " + negNums);
                break;
            } else if (inp < 0) {
                negNums = negNums + 1;
                System.out.println("Give a number:");
                continue;
            } else {
                System.out.println("Give a number:");
                continue;
            }
            
            
            
        }

    }
}
