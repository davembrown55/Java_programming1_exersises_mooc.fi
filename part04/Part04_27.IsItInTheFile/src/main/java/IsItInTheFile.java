
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
                
                
        ArrayList <String> fileData = new ArrayList <>(); 
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner readFile = new Scanner (Paths.get(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                fileData.add(line);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            
        }
        
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        Boolean isFound = false;
        
        for(String i: fileData) {
            if (i.contains(searchedFor)) {
                isFound = true;
            }
        }
        
        if (isFound == true) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found!");
        }
        
        

    }
}
