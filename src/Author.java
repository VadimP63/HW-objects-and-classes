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
        return "автор" + this.nameAuthor + " " + this.surnameAuthor;
    }
}
