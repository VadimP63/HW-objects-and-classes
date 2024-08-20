public class Main {
    public static void main(String[] args) {

        Author danielDefoe = new Author("Daniel", "Defoe");
        Book robinsonCrusoe = new Book("Робинзон крузо",danielDefoe, 1719);

        System.out.println(danielDefoe.getName() + " " + danielDefoe.getSurname());
        System.out.println("Книга - " + robinsonCrusoe.getTitle() + " " +
                robinsonCrusoe.getAuthor() + " " + robinsonCrusoe.getYearOfPublication());
        robinsonCrusoe.setYearOfPublication(1800);
        System.out.println("Год публикации книги " + robinsonCrusoe.getTitle() + " - " + robinsonCrusoe.getYearOfPublication());

        Author duma = new Author("Александр", "Дюма");
        System.out.println(duma.getName() + " " + duma.getSurname());

        Book monteKristo = new Book("Граф Монте-Кристо", duma, 1846);
        System.out.println("Книга - " + monteKristo.getTitle() + " " + monteKristo.getAuthor() + " "
                + monteKristo.getYearOfPublication());
        System.out.println("Год публикации книги " + monteKristo.getTitle() + " - " + monteKristo.getYearOfPublication());
    }
}