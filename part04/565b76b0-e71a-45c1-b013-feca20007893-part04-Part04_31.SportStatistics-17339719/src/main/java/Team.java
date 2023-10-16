/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class Team {
    private String name;
    private Integer played;
    private Integer won;
    private Integer lost;
    
    
    public Team (String name) {
        this.name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
    }
    
    public void hasPlayed () {
        this.played++;
    }
    
    public void hasWon () {
        this.won++;
    }
    public void hasLost () {
        this.lost++;
    }
    
  
    
    public String getName () {
        return this.name;
    }
    
    public Integer getPlayed () {
        return this.played;
    }
    
    public Integer getWon () {
        return this.won;
    }
    public Integer getLost () {
        return this.lost;
    }
    
    public String toString () {
        return "Games: " + this.getPlayed() + "\nWins: " + this.getWon() + "\nLosses: " + this.getLost();
    }
    
}
