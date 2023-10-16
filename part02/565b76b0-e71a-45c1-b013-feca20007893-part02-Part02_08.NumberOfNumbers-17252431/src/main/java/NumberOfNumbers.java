
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int nums = 0;
        
        System.out.println("Give a number:");
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());
            
            if (inp == 0) {
                System.out.println("Number of numbers: " + nums);
                break;
            } else {
                nums = nums + 1;
                System.out.println("Give a number:");
                continue;
            }
            
            
            
        }
        
        

    }
}
