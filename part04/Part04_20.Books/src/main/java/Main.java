import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList <Book> bookList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String inpT = scanner.nextLine();
            
            if (inpT.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int inpP = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int inpY = Integer.valueOf(scanner.nextLine());
        
            bookList.add(new Book(inpT, inpP, inpY));
        
        }
        
        System.out.println("What information would you like to be printed?");
        String toPrint = scanner.nextLine();
        
        if (toPrint.equals("everything")) {
            for (Book i: bookList) {
                System.out.println(i.toString());
            } 
        } else if (toPrint.equals("name")) {
              for (Book i: bookList) {
                System.out.println(i.getTitle());
            } 
        }
        
        
        
       

    }
}
