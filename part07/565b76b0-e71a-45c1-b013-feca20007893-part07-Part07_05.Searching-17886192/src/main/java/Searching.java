
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        
        ArrayList<Book> books1 = new ArrayList<>();
        Book book1 = new Book(1, "All Quiet on the Western front");
        Book book2 = new Book(2, "Frankenstein");
        Book book3 = new Book(3, "Ann Frank diary");
        Book book4 = new Book(4, "The Expanse");
        Book book5 = new Book(5, "Misery");
        Book book6 = new Book(6, "Jurrassic Park");
        Book book7 = new Book(7, "The Shining");
        Book book8 = new Book(8, "Discworld");
        Book book9 = new Book(9, "Ubik");
        Book book10 = new Book(10, "Station Eleven");
        Book book11 = new Book(11, "The trial");
        
        books1.add(book1);
        books1.add(book2);
        books1.add(book3);
        books1.add(book4);
        books1.add(book5);
        books1.add(book6);
        books1.add(book7);
        books1.add(book8);
        books1.add(book9);
        books1.add(book10);
        books1.add(book11);
        
        
//        System.out.println(linearSearch(books1, 8));
        System.out.println(binarySearch(books1, 8));
        
        
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<Book> books = new ArrayList<>();
//        System.out.println("How many books to create?");
//        int numberOfBooks = Integer.valueOf(scanner.nextLine());
//        for (int i = 0; i < numberOfBooks; i++) {
//            books.add(new Book(i, "name for the book " + i));
//        }
//
//        System.out.println("Id of the book to search for?");
//        int idToSearchFor = Integer.valueOf(scanner.nextLine());
//
//        System.out.println("");
//        System.out.println("Searching with linear search:");
//        long start = System.currentTimeMillis();
//        int linearSearchId = linearSearch(books, idToSearchFor);
//        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
//        if (linearSearchId < 0) {
//            System.out.println("Book not found");
//        } else {
//            System.out.println("Found it! " + books.get(linearSearchId));
//        }
//
//        System.out.println("");
//
//        System.out.println("");
//        System.out.println("Seaching with binary search:");
//        start = System.currentTimeMillis();
//        int binarySearchId = binarySearch(books, idToSearchFor);
//        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
//        if (binarySearchId < 0) {
//            System.out.println("Book not found");
//        } else {
//            System.out.println("Found it! " + books.get(binarySearchId));
//        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = 0;
        for (Book i: books){            
            if(i.getId() == searchedId) {
                return index;
            }
            index++;
        } 
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        int begin = 0;
        int end = books.size() -1;        
        
        while(begin <= end) {
            int middle = (end + begin) / 2;
            
            if (searchedId == books.get(middle).getId()) {
                return middle;
            }            
            if (searchedId > books.get(middle).getId()) {
                begin = middle + 1;
            }
            if (searchedId < books.get(middle).getId()) {
                end = middle -1;
            }       
        }    
        return -1;
    }
}

