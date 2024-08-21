import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surnameAuthor;

    public Author(String name, String surname) {
        this.nameAuthor = name;
        this.surnameAuthor = surname;
    }

    public String getName() {
        return this.nameAuthor;
    }

    public String getSurname() {
        return this.surnameAuthor;
    }

    public String toString() {
        return this.nameAuthor + " " + this.surnameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(nameAuthor, author.nameAuthor) && Objects.equals(surnameAuthor, author.surnameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor);
    }
}
