/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class Bird {
    private String name;
    private String latinName;
    private Integer observation;
    
    public Bird(String name, String latName){
        this.name = name;
        this.latinName = latName;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatinName() {
        return latinName;
    }

    public void setLatinName(String LatinName) {
        this.latinName = LatinName;
    }

    public Integer getObservation() {
        return observation;
    }

    public void setObservation(Integer Observation) {
        this.observation = Observation;
    }
    public void addObservation() {
        this.observation += 1;
    }
    public String toString() {
        return this.name + " (" + this.latinName + "): "
                + this.getObservation() + " observations";
    }
    
    
}
