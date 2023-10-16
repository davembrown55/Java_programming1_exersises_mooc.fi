
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
public class TodoList {
    private ArrayList <String> tasks;
    
    public TodoList () {
        this.tasks = new ArrayList<>();
    }
    
    public void add(String task) {
        this.tasks.add(task);
    }
    public void print() {
        int listNo = 1;
        
        for(String i: tasks) {
            System.out.println(listNo + ": " + i);
            listNo++;            
        }
    }
    public void remove(int number){
        number -= 1;
        this.tasks.remove(number);
    }
    
    
}
