
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("Search for? ");
        int input = Integer.valueOf(scanner.nextLine());
        
        
        for (int i = 0; i < list.size(); i++) {
            int value = list.get(i);
            if (input == value) {
                System.out.println(input + " is at index of " + i);
            }
        }    
        // implement here finding the indices of a number
    }
}
