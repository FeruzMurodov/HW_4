import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryCard<K extends Integer, V extends Book>{
    K cardId;
    V book;
    public LibraryCard(K cardId, V book) {
        this.cardId = cardId;
        this.book = book;
    }

    public K getCardId() {
        return cardId;
    }

    public void setCardId(K cardId) {
        this.cardId = cardId;
    }

    public V getBook() {
        return book;
    }

    public void setBook(V book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return  "ID: " + cardId +
                ". Книга: " + book;
    }
}
