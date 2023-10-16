
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string: ");
        String isString = scanner.nextLine();
        
        System.out.println("Give an integer: ");
        int isInt = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double: ");
        double isDub = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean isBool = Boolean.valueOf(scanner.nextLine());
        
//        System.out.println("You gave the string " + isString);
//        System.out.println("\nYou gave the integer" + isInt); 
//        System.out.println("\n You gave the double "  + isDub);
//        System.out.println("\n You gave the boolean : "  + isBool );
        
        System.out.println("You gave the string " + isString +
                "\nYou gave the integer " + isInt + "\nYou gave the double " 
                + isDub + "\nYou gave the boolean "  + isBool );
        

    }
}
