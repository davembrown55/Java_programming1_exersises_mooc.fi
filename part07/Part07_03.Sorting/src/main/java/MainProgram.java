
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        
//            // write your test code here
//    int[] numbers = {8, 3, 7, 9, 1, 2, 4};
//    MainProgram.sort(numbers);
        
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i: array) {
            if (smallest > i) {
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = smallest(array);
        int index = 0;
        int indexOfS = 0;
        
        for (int i:array) {
            if (i ==  smallest) {
                indexOfS = index;
            }
          index++;  
        }
        return indexOfS;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex){
            int smallest = table[startIndex];
            int indexOfS = 0;
        for(int i = startIndex; i < table.length; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
            }
        }
        for(int x = startIndex; x < table.length; x++) {
            if(table[x] == smallest){
                indexOfS = x;
            }
        }
        return indexOfS;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int num2 = array[index2];
        int numStore = array[index1];          
        array[index1] = num2;
        array[index2] = numStore;             
    }
    
    public static void sort(int[] array) {

        System.out.println(Arrays.toString(array));
        
        for (int i=0; i < array.length ; i++) {
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, i, smallest);
            
            System.out.println(Arrays.toString(array));
        } 
        
    }
}
