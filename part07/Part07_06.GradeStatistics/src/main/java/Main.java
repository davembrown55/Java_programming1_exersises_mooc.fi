
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeTool grades = new GradeTool();
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        UserInterface UI = new UserInterface(scanner, grades);
        UI.Start();
    }
}
