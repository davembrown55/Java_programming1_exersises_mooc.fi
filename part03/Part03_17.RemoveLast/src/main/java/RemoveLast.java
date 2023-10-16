
import java.util.ArrayList;

public class RemoveLast {
    
    public static void removeLast(ArrayList<String> strings) {
        
            if(strings.size() == 0) {            
                return;
            }
            int length = strings.size() -1;
            strings.remove(length);
        }
        
        
    
    

    public static void main(String[] args) {
        // Try your method in here
        ArrayList <String> aStrings = new ArrayList <>();
        
        aStrings.add("First");
        aStrings.add("second");
        aStrings.add("Third");
        
        System.out.println(aStrings);
        
        removeLast(aStrings);
        removeLast(aStrings);
        
        System.out.println(aStrings);
    }

}
