public class Main {


    public static void main(String[] args) {

        Book book = new Book("Tom soyer", "Mark Twen", 1876);
        System.out.println("book.name = " + book.name);
        System.out.println("book.author = " + book.author);
        System.out.println("book.year = " + book.year);

        Author author = new Author("Mark", "Twen");
        System.out.println("mark.firstName = " + author.name);
        System.out.println("mark.secondName = " + author.secondName);

    }
}