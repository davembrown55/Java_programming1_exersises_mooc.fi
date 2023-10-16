
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string: ");
        String word = scanner.nextLine();        
        
        String isTrue = "true";
        
        if (word.equals(isTrue)) {
            System.out.println("You got it right!");
        } else if (!(word.equals(isTrue))) {
            System.out.println("Try again");
        }
        
        
        
        
//        while(true) {
//            String word = scanner.nextLine();
//            if (word.equals(isTrue)) {
//                System.out.println("You got it right!");
//                break;
//            } else if (!(word.equals(isTrue))) {
//                System.out.println("Try again");
//                
//            }
//    
//        }
} }
