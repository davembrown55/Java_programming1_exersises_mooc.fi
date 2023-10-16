
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author davem
 */
public class Interface {

    private Scanner Iscanner;
    private Container first;
    private Container second;

    public Interface(Scanner scan, Container con1, Container con2) {
        this.first = con1;
        this.second = con2;
        this.Iscanner = scan;
    }

    public void start() {
        while (true) {
            System.out.println(this.currentValues());
//            System.out.print("> ");
            String input = Iscanner.nextLine();
            String[] inpStr = input.split(" ");    
            
            if (inpStr[0].equals("quit")) {
                break;
            } else if (inpStr[0].equals("add")) {
                int toAdd = Integer.valueOf(inpStr[1]);
                first.add(toAdd);
            } else if (inpStr[0].equals("remove")) {               
                int toRemove = Integer.valueOf(inpStr[1]);
                second.remove(toRemove);
            } else if (inpStr[0].equals("move")) {
                int toMove = Integer.valueOf(inpStr[1]);
                int check = first.contains();
                if (toMove > check) {
                    first.remove(toMove);
                    toMove = check;
                    second.add(toMove);
                } else{
                   first.remove(toMove);
                    second.add(toMove); 
                }  
            }    
        }
    }
    
    public String currentValues() {
        return "First: " + this.first.toString() + "\nSecond: " + this.second.toString();
    }
}
