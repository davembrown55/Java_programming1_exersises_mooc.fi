
public class Main {

    public static void main(String[] args) {

        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        s.add("James Bond");
        s.add("84");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.take();
        System.out.println(s.values());

    }
}
