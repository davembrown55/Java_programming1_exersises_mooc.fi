
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
public class UserInterface {
    private Scanner UI;
    
    public UserInterface(Scanner scan) {
        this.UI = scan;
    }  
    
    public void start(){
        BirdManagement birds = new BirdManagement();
        
        while (true) {                        
            System.out.println("?");
            String command = UI.nextLine();
            switch(command){
                case "Add":
                    System.out.println("Name:");
                    String name = UI.nextLine();
                    System.out.println("Name in Latin:");
                    String lName = UI.nextLine();
                    birds.addBird(name, lName);
                    break;
                case "Observation":
                    System.out.println("Bird?");
                    String obName = UI.nextLine();
                    birds.addObservation(obName);
                    break;
                case "All":
                    birds.printAll();
                    break;
                case "One": 
                    System.out.println("Bird?");
                    String printName = UI.nextLine();
                    birds.printOne(printName);
                    break;
                case "Quit":
                    return;
            }
            
            
            
        }
    }
    
    
}
