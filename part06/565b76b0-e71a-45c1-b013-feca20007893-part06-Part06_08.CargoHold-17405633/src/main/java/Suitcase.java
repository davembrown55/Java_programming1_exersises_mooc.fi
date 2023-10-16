/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author davem
 */
public class Suitcase {
    private ArrayList <Item> items;
    private int mWeight;
    
    public Suitcase (int maxWeight) {
        this.mWeight = maxWeight;
        this.items = new ArrayList <>();
    }
    
    public int totalWeight() {
        int weightSum = 0;
        
        for (Item i: this.items) {
            weightSum += i.getWeight();
            }
        return weightSum;
    }
    
    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.mWeight ) {
           this.items.add(item); 
        }
    }
    
    public void printItems () {
        for (Item i: this.items) {
            System.out.println(i);
        }
    }
    
    public Item heaviestItem () {
        
        if (this.items.isEmpty()) {
          return null;
        }
        
        Item hItem = this.items.get(0);
        
        for (Item i: this.items) {
            if (hItem.getWeight() < i.getWeight()) {
                hItem = i;
            }
        }
        return hItem;
        
    }
    
    public String toString() {
        if (this.items.isEmpty()) {
          return "no items (0 kg)"; 
        }       
        
        if (this.items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } else {
        int counter = 0;
        for (Item i: this.items) {
            counter++;
        }
        return counter + " items (" + totalWeight() + " kg)";
        }
    }
    
}
