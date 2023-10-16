
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        JokeManager jokes = new JokeManager();
        
        UserInterface UI = new UserInterface(jokes, scanner);
        
        UI.start();

    }
}
