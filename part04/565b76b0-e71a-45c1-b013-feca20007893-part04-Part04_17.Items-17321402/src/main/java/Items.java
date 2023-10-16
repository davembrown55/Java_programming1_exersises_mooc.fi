
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        while (true) {
            if (input.equals("")) {
                break;
            } 
            items.add(new Item(input));  
            input = scanner.nextLine();
        }
        
        System.out.println(items);
        
        

    }
}
