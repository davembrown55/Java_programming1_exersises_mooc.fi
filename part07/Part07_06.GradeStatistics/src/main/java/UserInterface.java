
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
public class UserInterface {
    private Scanner Ui;  
    private GradeTool Gtool;
    
    public UserInterface(Scanner scan, GradeTool grades) {
        this.Ui = scan;
        this.Gtool = grades;
    }
    
    public void Start() {
        System.out.println("Enter point totals, -1 stops:"); 
        int command = 0;
        while(command != -1) {
            
            command = Integer.valueOf(Ui.nextLine());   
            
            if(command <= 100 && command >= 0) {
                if(command >= 50) {
                    Gtool.addPoint(command);
                    Gtool.addPass(command);
                } else {
                    Gtool.addPoint(command);
                }     
            }          
            
        }
        double pointAve = Gtool.pointAve();
        double percPass = Gtool.passPercentage();
        
        if (Gtool.nobodyPassed()) {            
            System.out.println("Point average (all): " + pointAve);      
            System.out.println("Point average (passing):- ");
            System.out.println("Pass percentage: " + percPass );
            Gtool.gradeDistribution();
        } else{
            double passAve = Gtool.passesAve();
            System.out.println("Point average (all): " + pointAve);      
            System.out.println("Point average (passing): " + passAve);    
            System.out.println("Pass percentage: " + percPass );
            Gtool.gradeDistribution();
        }       
    }
    
}
