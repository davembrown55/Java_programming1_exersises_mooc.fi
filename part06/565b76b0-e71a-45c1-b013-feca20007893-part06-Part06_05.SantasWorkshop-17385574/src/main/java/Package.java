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
public class Package {
    private ArrayList <Gift> gifts;
    
    
    public Package () {
        this.gifts = new ArrayList <> ();
        
    }
    
    public void addGift (Gift newGift) {
        this.gifts.add(newGift);
    }
    public int totalWeight () {
        int packageWeight = 0;
        for (Gift i: gifts) {
            packageWeight += i.getWeight();
        }
        return packageWeight;
    }
    
    
}
