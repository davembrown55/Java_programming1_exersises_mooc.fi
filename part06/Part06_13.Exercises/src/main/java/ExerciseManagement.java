
import java.util.ArrayList;


public class ExerciseManagement {
    private ArrayList<Exercise> exerciseList;
 // private ArrayList<String> completedExercises;
    
    public ExerciseManagement() {
        this.exerciseList = new ArrayList<>();
//      this.completedExercises = new ArrayList<>();

    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> listOfExNames = new ArrayList<>();
        for (Exercise i: this.exerciseList) {
            listOfExNames.add(i.getName());
        }        
        return listOfExNames;
    }
    
    public void add(String toAdd) {
        this.exerciseList.add(new Exercise(toAdd));
    }
    
    public void markAsCompleted(String exercise) {
        for(Exercise i: this.exerciseList) {
            if(i.getName().equals(exercise)) {
                i.setCompleted(true);
            }            
        }
    }
    
    public boolean isCompleted(String exercise){
        boolean complete = false;        
        for(Exercise i: this.exerciseList) {
            if(i.getName().equals(exercise)) {
                complete = i.isCompleted();
            }         
        } return complete;
    } 

}
