import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
    List<Book> list = new ArrayList<>();
    List<LibraryCard> givenCards = new ArrayList<>();
    void addBook(Book book){
        list.add(book);
        System.out.println("Книга успешно добавлен в библиотеку!");
    }
    void addLibraryCard(LibraryCard card){
        int id = card.getCardId();
        givenCards.add(card);
        System.out.printf("Карточка c ID " + id + " успешно создан и выдан! \n");
    }
    int count = 1;
    void giveBook(Book book){
        addLibraryCard(new LibraryCard<>(count++, book));
    }

    public List<Book> getList() {
        return list;
    }

    public void setList(List<Book> list) {
        this.list = list;
    }

    public void printGivenCards() {
        System.out.println("Выданные книги: ");
        for (LibraryCard card : givenCards){
            System.out.println(card);
        }
    }


    @Override
    public String toString() {
        return "Список книг: " + list;
    }
}
