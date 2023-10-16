
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        System.out.println("Enter number: ");
        
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == 9999) {
                break;
            }
            
            numbers.add(input);
                        
        }
        
        int smallest = numbers.get(0);
        
        for (int i = 0; i < numbers.size(); i++) {
            int indVal = numbers.get(i);
            
            if (smallest > indVal) {
                smallest = indVal;
            }
        }   System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < numbers.size(); i++) {
            int value = numbers.get(i);
            if (smallest == value) {
                System.out.println("Found at index of: " + i);
            }
        } 
        
      

        
    }
}
