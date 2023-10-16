
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
        
        
//        list.add("this is a task");
//        list.add("this is another task");
//        list.add("this a third task");
        

        
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

    }
}
