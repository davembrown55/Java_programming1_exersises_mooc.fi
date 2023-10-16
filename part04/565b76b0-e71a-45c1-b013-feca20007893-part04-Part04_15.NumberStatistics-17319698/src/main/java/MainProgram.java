
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        
          Statistics statisticsTotal = new Statistics(); 
          Statistics even = new Statistics(); 
          Statistics odd = new Statistics(); 
//        statistics.addNumbers(3);
//        statistics.addNumbers(5);
//        statistics.addNumbers(1);
//        statistics.addNumbers(2);
//        
//        System.out.println(statistics.toString());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
//        
        
        // Part 3 
        
        System.out.println("Enter numbers: ");
        int number = Integer.valueOf(scanner.nextLine());
        
        while (true) {
            if (number == -1) {
                break;
            }
            if (number % 2 == 0) {
                statisticsTotal.addNumber(number); 
                even.addNumber(number); 
                number = Integer.valueOf(scanner.nextLine());
                continue;
            } else {
                statisticsTotal.addNumber(number); 
                odd.addNumber(number); 
                number = Integer.valueOf(scanner.nextLine());
                continue;
            }
            
            
        }
        
        System.out.println("Sum: " + statisticsTotal.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
        

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
