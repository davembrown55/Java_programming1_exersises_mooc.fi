
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //ArrayList <Integer> ages = new ArrayList <Integer> ();
       // int oldest = 0;       
       
        String input = scanner.nextLine();               
        String[] nameAge = input.split(",");      
        
        String oldestName = "";
        int oldestAge = 0;
        int age = Integer.valueOf(nameAge[1]);
     
        while(true) {
            if(age > oldestAge) {
                oldestAge = age;
                oldestName = nameAge[0];
            }
            
            input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            } else {
                nameAge = input.split(","); 
                age = Integer.valueOf(nameAge[1]);
            }
            
        }
        
        System.out.println("Name of the oldest: " + oldestName);
        
  
    }
}
