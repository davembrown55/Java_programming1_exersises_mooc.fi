
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
public class GradeTool {

    private ArrayList<Integer> points;
    private ArrayList<Integer> passingGrades;

    public GradeTool() {
        this.points = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void addPoint(int num) {
        this.points.add(num);
    }

    public void addPass(int num) {
        this.passingGrades.add(num);
    }

    public boolean nobodyPassed() {
        return this.passingGrades.isEmpty();
    }

    public double pointAve() {
        int sum = 0;
        int counter = 0;
        for (Integer i : this.points) {
            sum += i;
            counter++;
        }
        return (double) sum / counter;
    }

    public double passesAve() {
        int sum = 0;
        int counter = 0;
        for (Integer i : this.passingGrades) {
            sum += i;
            counter++;
        }
        return (double) sum / counter;
    }

    public double passPercentage() {
        int pass = this.passingGrades.size();
        int participants = this.points.size();
        double perc = 100 * ((double) pass / participants);
        return perc;
    }

    public void gradeDistribution() {
        String aa = "5: ";
        String a = "4: ";
        String b = "3: ";
        String c = "2: ";
        String d = "1: ";
        String f = "0: ";
        System.out.println("Grade distribution:");
        for (Integer i : points) {
            if (i >= 90) {
                aa += "*";
            }
            if (i >= 80 && i < 90) {
                a += "*";
            }
            if (i >= 70 && i < 80) {
                b += "*";
            }
            if (i >= 60 && i < 70) {
                c += "*";
            }
            if (i >= 50 && i < 60) {
                d += "*";
            }
            if (i >= 0 && i < 50) {
                f += "*";
            }                
        }
        System.out.println(aa + "\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + f);
    
    }
}
