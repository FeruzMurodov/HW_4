public class Book<T> {
    protected T name;
    protected String author;
    protected String genre;

    public Book(T name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\n" + "Наименование: " + name +
                ", Автор: " + author +
                ", Жанр: " + genre;
    }
}
