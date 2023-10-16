
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(" ");

        int index = 0;

        while (true) {
            if (input.isEmpty()) {
                break;
            }

            if (index == words.length) {
                input = scanner.nextLine();
                words = input.split(" ");
                index = 0;
                continue;
            }

            for (int i = 0; i < words.length; i++) {
                if (words[i].contains("av")) {
                    System.out.println(words[i]);
                    index++;
                } else if (!(words[i].contains("av"))) {
                    index++;
                }
            }
        }

    }
}
