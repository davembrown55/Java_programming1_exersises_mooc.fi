
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrensHospital = new HealthStation();
        
        Person ethan = new Person ("Ethan", 1, 110, 7);
        Person peter = new Person ("Peter", 33, 176, 85);
        
        System.out.println(ethan.getName() + "'s weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childrensHospital.weigh(peter) + " kilos");
        
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        childrensHospital.feed(ethan);
        
        System.out.println("Weighings performed: " + childrensHospital.weighings());
        
        System.out.println(ethan.getName() + "'s weight: " + childrensHospital.weigh(ethan) + " kilos");
        System.out.println(peter.getName() + "'s weight: " + childrensHospital.weigh(peter) + " kilos");
        
               
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);
        
        System.out.println("Weighings performed: " + childrensHospital.weighings());
        
        
        
    }
}