
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        
        int times = 3;
        
        for(int i =0; i < times; i++ ) {
            System.out.print(word);
        }

    }
}
