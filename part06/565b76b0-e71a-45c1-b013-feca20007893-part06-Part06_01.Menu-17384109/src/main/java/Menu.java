
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // implement the required methods here
    
    public void addMeal (String Meal) {
        if (!(meals.contains(Meal))) {
            this.meals.add(Meal);
        }
    }
    
    public void printMeals () {
        for (String i: this.meals) {
            System.out.println(i);
        }
    }
    public void clearMenu () {
        this.meals.clear();
        
    }
    
}
