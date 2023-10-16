
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number");
        int num = Integer.valueOf(scanner.nextLine());
        
                
        int sum = num * num;
        System.out.println(sum);
    }
}
