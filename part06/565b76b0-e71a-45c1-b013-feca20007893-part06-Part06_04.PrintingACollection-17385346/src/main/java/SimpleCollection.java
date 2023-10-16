
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString () {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        } else {
            
            int length = this.elements.size();
            if (length == 1) {
                return "The collection " + this.name + " has " + length + " element:\n" + this.elements.get(0);
            } else {
                String toRet = "The collection " + this.name + " has " + length + " elements:\n";
                for (int i = 0; i < this.elements.size(); i++ ) {
                    toRet = toRet + this.elements.get(i) + "\n";
                }
                return toRet;
            }
            
            
            
            
            
        }
        
        
        
    }
    
}
