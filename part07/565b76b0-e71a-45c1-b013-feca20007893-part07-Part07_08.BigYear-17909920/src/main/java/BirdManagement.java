
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
public class BirdManagement {
    ArrayList<Bird> birds;
    
    public BirdManagement() {
        this.birds = new ArrayList<>();
    }

    public ArrayList<Bird> getBirds() {
        return birds;
    }

    public void setBirds(ArrayList<Bird> birds) {
        this.birds = birds;
    }
    
    public void addBird(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }
    public void addObservation(String name) {
        boolean isBird = false;
        for(Bird i: this.birds) {
            if(i.getName().equals(name)) {
                i.addObservation();
                isBird = true;
            }            
        }
        if(isBird == false) {
            System.out.println("Not a bird!");
        }        
    }
    public void printAll() {
        for(Bird i: this.birds) {
            System.out.println(i);
        }
    }
    public void printOne(String name) {
        boolean isBird = false;
        for(Bird i: this.birds) {
            if(i.getName().equals(name)) {
                System.out.println(i);
                isBird = true;
            }
        }
        if(isBird == false) {
            System.out.println("Not a bird!");
        }        
    }
    
}
