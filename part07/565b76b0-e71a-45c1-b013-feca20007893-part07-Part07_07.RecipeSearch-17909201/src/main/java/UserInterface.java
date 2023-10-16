
import java.nio.file.Paths;
import java.util.ArrayList;
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
    Scanner UI;
    
    public UserInterface(Scanner scan) {
        this.UI = scan;
    }
    
    public void start() {
        System.out.println("File to read: ");
        String filePath = UI.nextLine();  
        
        RecipeManager recipes = new RecipeManager();
        recipes.read(filePath);  
        
        System.out.println("\nCommands:\nlist - lists the recipes\nstop - stops the program"
                + "\nfind name - searches recipes by name\nfind cooking time - "
                + "searches recipe by cooking time"
                + "\nfind ingredient - searches recipes by ingredient"); 
        
        while(true) {
            System.out.println("\nEnter Command: ");
            String command = UI.nextLine();
            switch(command) {
                case "list":
                    recipes.listAll();  
                    break;
                case "find name":
                    System.out.println("Enter name:");
                    String name = UI.nextLine();
                    recipes.searchByName(name);
                    break;
                case "find cooking time":
                    System.out.println("Enter max time:");
                    int time = Integer.valueOf(UI.nextLine());
                    recipes.searchByTime(time);
                    break;
                case "find ingredient":
                    System.out.println("Enter ingredient:");
                    String ingredient = UI.nextLine();
                    recipes.searchByIngredient(ingredient);                    
                    break;
                case "stop":
                    return;
            }            
        }
    }
    
}
