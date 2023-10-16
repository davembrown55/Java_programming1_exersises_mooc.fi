
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please give me a number");
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num < 0) {
            int neg = num * -1;
            System.out.println(neg);
        } else {
            System.out.println(num);
        }
        
    }
}
