
import java.util.Scanner;
import java.util.*;

public class Password {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String pass = scanner.nextLine();
        
//        lPass = pass.toLowercase();
        
        
        if (pass.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        
        
        
    }
}
