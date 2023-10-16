
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        String input = scanner.nextLine();
        String [] nameAge = input.split(",");

        int oldest = 0;
        int age = Integer.valueOf(nameAge[1]);
        
        while(true) {
            if (age > oldest) {
                oldest = age;
            }
            
            input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                nameAge = input.split(",");
                age = Integer.valueOf(nameAge[1]);
            }
            
        }
        System.out.println("Age of the oldest: " + oldest);

    }
}
