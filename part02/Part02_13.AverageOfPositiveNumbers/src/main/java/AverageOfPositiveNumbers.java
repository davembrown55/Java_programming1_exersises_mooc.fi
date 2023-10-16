
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        int count = 0;

        System.out.println("Give a number:");
        while (true) {
            int inp = Integer.valueOf(scanner.nextLine());

            if (inp == 0) {
                if (total <= 0) {
                    System.out.println("Cannot calculate average");
                    break;                    
                } else {
                    double ave = (double) total / count;
                    System.out.println("Average of the numbers: " + ave);
                    break;
                }
            } else if (inp > 0){
                total = total + inp;
                count++;
                System.out.println("Give a number:");
                continue;
            } else {
                System.out.println("Give a number:");
                continue;
            }

        }
    }
}
