
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> strings = new ArrayList<>(); 
        
        int counter = 0;
        
        while(true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            strings.add(input);
            
        }
        for (String i: strings) {
            counter++;
        }
        System.out.println(counter);
        
        
        
        
        
        
        

    }
}
