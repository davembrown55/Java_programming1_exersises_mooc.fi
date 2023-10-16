
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
public class RecipeManager {
    private ArrayList <recipe> recipes; 
    
    public RecipeManager() {
    this.recipes = new ArrayList<>();
    }   
    
    public void read(String fName) {
        try (Scanner reader = new Scanner(Paths.get(fName))) {
            
            while (reader.hasNextLine()) {
            
            String name = reader.nextLine();           
            Integer time = Integer.valueOf(reader.nextLine());            
            
            ArrayList <String> ingredients = new ArrayList<>();
            
                while(reader.hasNextLine()) {
                    String ingredient = reader.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    } else {
                        ingredients.add(ingredient);
                    }
                } 
            this.recipes.add(new recipe(name, time, ingredients));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }  
    }
    
    public void listAll() {
        for (recipe i: this.recipes) {
                System.out.println(i);
            }    
    }
    public void searchByName(String name) {
        for(recipe i: this.recipes) {
            if (i.getName().contains(name)) {
                System.out.println(i);
            }
        }
    }
    public void searchByTime(int time) {
        System.out.println("Recipes:");
        for(recipe i: this.recipes) {            
            if (time >= i.getCookTime()) {
                System.out.println(i);
            }
        }
    }
    public void searchByIngredient(String ing) {
        System.out.println("Recipes:");
        for(recipe i: this.recipes) {  
            ArrayList<String> ingList = i.getIngredients();
            for(String x: ingList) {
                if(x.equals(ing)) {
                    System.out.println(i);
                }
            }
        }
    }
    
}
