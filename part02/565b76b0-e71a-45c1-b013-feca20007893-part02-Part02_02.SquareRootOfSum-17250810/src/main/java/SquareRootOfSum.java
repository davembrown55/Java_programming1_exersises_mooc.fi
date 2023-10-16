
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please give me a number");
        int num1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Please give me another number");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int toSqu = num1 + num2;
        
        double squareRoot = Math.sqrt(toSqu);
        
        System.out.println(squareRoot);
        

    }
}
