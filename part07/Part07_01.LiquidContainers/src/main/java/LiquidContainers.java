
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
//            System.out.println("add - Adds liquid to first container");
//            System.out.println("move - Moves liquid from first container to second container");
//            System.out.println("remove - removes liquid from second container");            
            System.out.println("First:" + first + "/100\nSecond: " + second + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else if (input.contains("add")) {
                String unString = input.replace("add ", "");
                int toAdd = Integer.valueOf(unString);

                if (first + toAdd > 100) {
                    first = 100;
                } else if (toAdd < 0) {
                    first = first;
                } else {
                    first += toAdd;
                }
            } else if (input.contains("remove")) {
                String unString = input.replace("remove ", "");
                int toRemove = Integer.valueOf(unString);

                if (toRemove > second) {
                    second = 0;
                } else if (toRemove < 0) {
                    second = second;
                } else if (toRemove <= second) {
                    second -= toRemove;
                }

            } else if (input.contains("move")) {
                String unString = input.replace("move ", "");
                int toMove = Integer.valueOf(unString);
                if (toMove < 0) {
                    first = first;
                } else if (toMove > first) {
                    toMove = first;
                    first = 0;
                    if (second + toMove > 100) {
                        second = 100;
                    } else {
                        second += toMove;
                    }
                } else if (toMove <= first) {
                    first -= toMove;
                    if (second + toMove > 100) {
                        second = 100;
                    } else {
                        second += toMove;
                    }
                }

            }

        }

    }

}
