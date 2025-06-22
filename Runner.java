package book;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main (String[] args) {


        // Create an ArrayList of Book objects
        List<Book> bookList = new ArrayList<>();

        // Add books to the ArrayList
        bookList.add(new Book("Moby Dick", "Herman Melville", true));
        bookList.add(new Book("The Adventures of Sherlock Holmes", "Sir Arthur Conan Doyle", false));
        bookList.add(new Book("Pride and Prejudice", "Jane Austen", true));
        bookList.add(new Book("The Catcher in the Rye", "J.D. Salinger", false));

        // Iterate through the ArrayList and display book information
        for (Book book : bookList) {
            if (book.isBorrowed()) {
                System.out.println("Book borrowed.");
            } else {
                System.out.println("Book is not borrowed.");
            }

            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Book: " + book.toString());

            boolean returned = book.giveBack();

            if (returned) {
                System.out.println("Book returned.");
            } else {
                System.out.println("Book is available for borrowing.");
            }

            System.out.println(); // Add a blank line for separation
        }
    }
}