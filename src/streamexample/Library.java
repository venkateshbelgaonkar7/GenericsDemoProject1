package streamexample;

import java.util.ArrayList;

public class Library {
        public static void main(String[] args) {
            ArrayList<Book> books = populateLibrary();
            books.stream().filter(book -> {
                return book.getAuthor().startsWith("J");
            }).filter(book -> {
                return book.getTitle().startsWith("E");
            }).forEach(System.out::println);
    }
    static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice walker", "The Color Purple"));
        books.add(new Book("Alice walker", "Meridian"));
        books.add(new Book("Toni Morrison", "Beloved"));
        books.add(new Book("Toni Morrison", "Jazz"));
        books.add(new Book("Toni Morrison", "Paradise"));
        books.add(new Book("John Steinback", "The Grape of Wrath"));
        books.add(new Book("John Steinback", "East of Eden"));
        books.add(new Book("Kazuro Ishiguro", "The Remains of the Day"));
        books.add(new Book("Kazuro Ishiguro", "Never let me go"));
        books.add(new Book("Kazuro Ishiguro", "The Buried giant"));
        books.add(new Book("Jane Austin ", "Pride and Prejudice"));
        books.add(new Book("Jane Austin", "Emma"));
        books.add(new Book("Jane Austin", "Persuation"));
        return books;
    }
}
