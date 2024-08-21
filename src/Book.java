import java.util.Objects;

public class Book {
    private Author nameOfAuthor;
    private String title;
    private int yearOfPublication;

    public Book(String title, Author nameOfAuthor, int yearOfPublication) {
        this.nameOfAuthor = nameOfAuthor;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
    }

    public Author getAuthor() {
        return this.nameOfAuthor;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Автор: " + nameOfAuthor +
                ", название: " + title + '\'' +
                ", год публикации: " + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameOfAuthor, book.nameOfAuthor) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfAuthor, title, yearOfPublication);
    }
}
