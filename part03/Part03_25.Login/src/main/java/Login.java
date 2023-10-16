
import java.util.Scanner;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {
        ArrayList <String> user1 = new ArrayList <String>();
        ArrayList <String> user2 = new ArrayList <String>();
        
        user1.add("alex");
        user1.add("sunshine");
        
        user2.add("emma");
        user2.add("haskell");
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String user = scanner.nextLine();
        
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        
        System.out.println(user1.get(0) + user1.get(1));
        
        if ((user.equals(user1.get(0)) && pass.equals(user1.get(1))) || (user.equals(user2.get(0)) && pass.equals(user2.get(1)))) {
            System.out.println("You have succesfully logged in!");
        } else {
            System.out.println("Incorrect username or password");
        }
        
        
        
        
        

    }
}
