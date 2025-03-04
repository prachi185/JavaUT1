// Define the Book class
class Book {
    // Fields (instance variables) of the Book class
    String title;
    String author;
    double price;

    // Default constructor to initialize the Book object
    public Book() {
        title = "Unknown Title";
        author = "Unknown Author";
        price = 0.0;
    }

    // Method to display the Book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

// Main class to test the Book class
public class BookDemo {
    public static void main(String[] args) {
        // Create a Book object using the default constructor
        Book myBook = new Book();

        // Display the details of the Book
        myBook.displayBookDetails();
    }
}
