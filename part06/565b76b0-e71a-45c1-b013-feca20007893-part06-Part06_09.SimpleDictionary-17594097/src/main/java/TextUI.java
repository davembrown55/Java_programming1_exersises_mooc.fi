
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDict;
    
    public TextUI(Scanner scanner, SimpleDictionary simpleDict){
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }
    
    public void start () {        
        
        while(true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            else if (word.equals("add")){
                System.out.println("Word: ");
                String word1 = scanner.nextLine();
                
                System.out.println("translation: ");
                String word2 = scanner.nextLine();
                
                simpleDict.add(word1, word2);
            }
            else if(word.equals("search")) {
                System.out.println("To be translated: ");
                String toTranslate = scanner.nextLine();
                
                if (simpleDict.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                } else {          
                System.out.println(simpleDict.translate(toTranslate));
                }
            }
            else {System.out.println("Unknown Command"); }
            
        }
    }
    
}
