
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int starPrint = 1;
        if (size == 1) {
            printStars(1);
        } else {
            for (int i = size - 1; i >= 0; i--) {
                printSpaces(i);
                printStars(starPrint);
                starPrint++;
            }
        }

    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int starPrint = 1;
        int baseSpace = height - 2;

        for (int i = height - 1; i >= 0; i--) {
            printSpaces(i);
            printStars(starPrint);
            starPrint += 2;
        }
        if (height < 3) {
            printStars(3);
            printStars(3);

        } else if (height >= 3) {
            printSpaces(baseSpace);
            printStars(3);
            printSpaces(baseSpace);
            printStars(3);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(1);
        System.out.println("---");
        printTriangle(2);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
