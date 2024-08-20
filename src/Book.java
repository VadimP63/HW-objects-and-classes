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
}
