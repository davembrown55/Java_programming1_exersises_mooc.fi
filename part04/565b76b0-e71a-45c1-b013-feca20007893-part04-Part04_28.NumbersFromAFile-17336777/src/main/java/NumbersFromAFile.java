
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList <Integer> nums = new ArrayList <> ();

        System.out.println("File? ");
        String file = scanner.nextLine();
        
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner readFile = new Scanner(Paths.get(file))) {
            while (readFile.hasNextLine()) {
                int line = Integer.valueOf(readFile.nextLine());
                
                if (line >= lowerBound && line <= upperBound) {
                    nums.add(line);
                }               
                
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Numbers: " + nums.size());
        

    }

}
