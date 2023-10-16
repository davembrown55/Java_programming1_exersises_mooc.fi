
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
     SimpleDictionary dictionary = new SimpleDictionary();
     Scanner scanner = new Scanner(System.in);   
     TextUI textUI = new TextUI(scanner, dictionary);    
     
     textUI.start();
     
//        System.out.println(dictionary.translate("merde"));
        
    }
}
