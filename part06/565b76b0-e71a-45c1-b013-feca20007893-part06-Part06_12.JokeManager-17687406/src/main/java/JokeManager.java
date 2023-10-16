
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class JokeManager {
    private ArrayList <String> jokes;
    
    public JokeManager() {
       this.jokes = new ArrayList<>(); 
    }

    public ArrayList<String> getJokes() {
        return jokes;
    }

    public void setJokes(ArrayList<String> jokes) {
        this.jokes = jokes;
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke(){
        if (jokes.isEmpty()) {
            return "Jokes are in short supply.";
        } else {
            System.out.println("Drawing a joke.");
            Random draw = new Random();
            int index =  draw.nextInt(jokes.size());
            return jokes.get(index);
        }
    }
    
    public void printJokes () {
        System.out.println("Printing the jokes.");
        for (String i: this.jokes) {
            System.out.println(i);
        }
    }
}
