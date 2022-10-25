public class Main {


    public static void main(String[] args) {
        Book book = new Book("Tom Sayer", "Mark Twain", 1876);
        System.out.println("book.name = " + book.getName());
        System.out.println("book.author = " + book.getAuthor());
        System.out.println("book.year = " + book.getYear());
        book.setYear(1999);
        System.out.println("book.year = " + book.getYear());

        Author author = new Author("Mark", "Twain");
        System.out.println("author.name = " + author.getName());
        System.out.println("author.secondName = " + author.getSecondName());
        author.setName("Maark");
        author.setSecondName("Twaain");
        System.out.println("author.getName() = " + author.getName());
        System.out.println("author.getSecondName() = " + author.getSecondName());

        Author author1 = new Author("Alexander", "Pushkin");
        Book book1 = new Book("Golden fish", author1.getName(), 1833);
        book1.setYear(13_10_1833);
        System.out.println("book1.getYear() = " + book1.getYear());
        System.out.println("book1.getAuthor() = " + book1.getAuthor());


    }
}