
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class recipe {
    private String name;
    private Integer cookTime;
    private ArrayList <String> ingredients;
    
    public recipe (String name, Integer time, ArrayList<String> ingredients) {
        this.name = name;
        this.cookTime = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCookTime() {
        return cookTime;
    }

    public void setCookTime(Integer cookTime) {
        this.cookTime = cookTime;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
    
    public void addIngredients(String ing) {
        this.ingredients.add(ing);
    }
    
    public String toString() {
        return this.getName() + ", cooking time: " + this.getCookTime(); //+ ", ingredients: " + this.getIngredients();
    }
    
}
