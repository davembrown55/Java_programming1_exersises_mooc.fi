
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> listOfItems = new ArrayList<>();

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();

            if (id.equals("")) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            Items item = new Items(id, name);

            if (!(listOfItems.contains(item))) {
                listOfItems.add(item);
            }

        }
        System.out.println("==Items==");

        boolean inList = false;

        for (Items i : listOfItems) {

            System.out.println(i);

        }
    }

}
