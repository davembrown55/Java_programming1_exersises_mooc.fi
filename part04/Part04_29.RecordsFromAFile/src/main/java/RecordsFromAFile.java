
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        
        String fileName = scanner.nextLine();
        
        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                
                String lineData [] =  line.split(",");
                
                System.out.println(lineData[0] + ", age: " + lineData[1] + " years");
                                
            }
            
            
        } catch(Exception e) { 
            System.out.println("Error" + e.getMessage());
        }

    }
}
