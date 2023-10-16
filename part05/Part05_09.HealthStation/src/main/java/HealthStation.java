
public class HealthStation {
    private int weightCounter;
    
    public HealthStation () {
        this.weightCounter = 0;
    }

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weightCounter++;
        return person.getWeight(); 
        
    }
    
    public void feed (Person person) {
        int incByOne = person.getWeight() + 1;
        person.setWeight(incByOne);
    }
    
    public int weighings () {
        return this.weightCounter;
    }

}
