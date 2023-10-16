
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> years = new ArrayList<Integer>();

        String input = scanner.nextLine();
        String[] nameDob = input.split(",");

        String longName = "";
        String name = nameDob[0];
        years.add(Integer.valueOf(nameDob[1]));

        while (true) {
            if (name.length() > longName.length()) {
                longName = name;
            }
            input = scanner.nextLine();

            if (input.equals("")) {
                break;
            } else {
                nameDob = input.split(",");
                name = nameDob[0];
                years.add(Integer.valueOf(nameDob[1]));

            }
        }
        int total = years.size();
        int sum = 0;
        for (int i = 0; i < years.size(); i++) {
            sum += years.get(i);
        }
        double ave = (double) sum / total;

        System.out.println("Longest name: " + longName + "\nAverage of the birth years: " + ave);

    }
}
