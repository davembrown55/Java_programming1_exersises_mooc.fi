/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class Gift {
    private String name;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
         
    }
    
}
