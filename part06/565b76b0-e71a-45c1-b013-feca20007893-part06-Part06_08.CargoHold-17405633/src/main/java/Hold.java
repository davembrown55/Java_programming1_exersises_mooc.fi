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
public class Hold {
    private int mWeight;
    private ArrayList <Suitcase> suitcases;
    
    public Hold (int maxWeight) {
        this.mWeight = maxWeight;
        this.suitcases = new ArrayList <>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight() + suitcase.totalWeight() <= this.mWeight) {
            suitcases.add(suitcase);
        }
    }
    
   public int currentWeight () {
       if (this.suitcases.isEmpty()) {
           return 0;
       }
       int weightSum = 0;
       for (Suitcase i: this.suitcases) {
           weightSum += i.totalWeight();
       }
       return weightSum;
   }
   
    public void printItems () {
        for (Suitcase i: this.suitcases) {
            i.printItems();
        }
    }
   
   public String toString () {
        if (this.suitcases.size() == 1) {
            return "1 suitcase (" + currentWeight() + " kg)";
        } else {
        int counter = 0;
        for (Suitcase i: this.suitcases) {
            counter++;
        }
        return counter + " suitcases (" + currentWeight() + " kg)";
        }
   }
    
}
