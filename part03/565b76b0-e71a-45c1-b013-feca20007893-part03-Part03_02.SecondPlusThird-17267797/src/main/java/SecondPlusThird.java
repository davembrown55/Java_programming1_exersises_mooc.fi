
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }
        int num1 = numbers.get(1);
        int num2 = numbers.get(2);
        int sum = num1 + num2;

        System.out.println(sum);
    }
}
