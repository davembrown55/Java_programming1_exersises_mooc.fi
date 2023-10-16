/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author davem
 */
public class Timer {

    private int hundredths;
    private int seconds;

    public Timer() {
        this.hundredths = 0;
        this.seconds = 0;
    }

    // 
    public void advance() {

            if (this.hundredths < 100) {
                this.hundredths++;
            }

            if (this.hundredths == 100 && this.seconds == 59) {
                this.hundredths = 0;
                this.seconds = 0;
            }

            if (this.hundredths == 100 && this.seconds < 59) {
                this.hundredths = 0;
                this.seconds++;
            }

        }


    
    public String toString () {
        String timePrint = "";
        
        if (this.seconds < 10) {
            timePrint += "0" + this.seconds;
        } else if(this.seconds >= 10) {
            timePrint += this.seconds;
        }
        
        timePrint += ":";
        
        if (this.hundredths < 10) {
            timePrint += "0" + this.hundredths;
        } else if(this.hundredths >= 10) {
            timePrint += this.hundredths;
        }
                
        return timePrint;
                
                
                
                
    } 

}
