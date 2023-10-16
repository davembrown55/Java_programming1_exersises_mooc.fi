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
public class Room {
    private ArrayList <Person> personList;

    public Room () {
        this.personList = new ArrayList <> ();
    }
    
    public void add (Person person) {
        this.personList.add(person);
    }
    public boolean isEmpty() {
        return this.personList.isEmpty();
    }
    public ArrayList<Person> getPersons() {
        return this.personList;
    }
    
    public Person shortest () {
        if (this.personList.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.personList.get(0);
        for (Person i: this.personList) {
            if (shortestPerson.getHeight() > i.getHeight()) {
                shortestPerson = i;
            }
        }        
        return shortestPerson;
    }
    
    public Person take () {
        Person isShortest = shortest();
        this.personList.remove(shortest());
        return isShortest;        
    }
    
}
