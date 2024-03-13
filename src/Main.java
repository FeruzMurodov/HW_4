import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book<>("ErquelPuaro", "AgathaCristie", "detective");
        Book book2 = new Book<>("LongWay", "Maria", "romances");
        Book book3 = new Book<>("Split", "Arisu", "fantasy");
        Library library1 = new Library();
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        System.out.println(library1);
        library1.giveBook(book1);
        library1.giveBook(book2);
        library1.giveBook(book3);
        library1.giveBook(book2);
        library1.giveBook(book3);
        library1.printGivenCards();

    }
}