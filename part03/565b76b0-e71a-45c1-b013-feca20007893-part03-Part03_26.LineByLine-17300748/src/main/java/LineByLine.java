
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        String[] words = input.split(" ");
        
        int index = 0;
        int counter = 0;
        
        while (true) {
            if (input.isEmpty()) {
                break;
            }
            
            if (index == words.length) {
                    input = scanner.nextLine();
                    words = input.split(" ");
                    counter = 0;
                    index = 0;
                    continue;
                }  
            for (int i = 0; i < words.length; i++) {
                System.out.println(words[i]);
                counter++;
                index++;
            }
        }     
    }
}
