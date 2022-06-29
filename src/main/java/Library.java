// import java.util.List;
// import java.util.ArrayList;

import java.util.HashMap;

public class Library {
    HashMap<String, Book> library = new HashMap<String, Book>();


    public void addBookToLibrary(Book bookToAdd) {
        library.put(bookToAdd.getTitle(), bookToAdd);
        System.out.println("The book " + bookToAdd.getTitle() + " has been added to the library!");


        System.out.println("The following books are now in the library: ");
        for (String bookTitle : library.keySet() ) {
            System.out.println(bookTitle);
        }
    }

    public void findExistingBook(String bookTitleInput) {
        
        Book bookResult = library.get(bookTitleInput);
        
        if (bookResult == null) {
            System.out.println("Hmmmm... Not sure if we have that one!");
            System.out.println("You should consider adding it to the list!");

        }
        else {
            System.out.println("We have found the book you are looking for!");
            System.out.println("Here are the details: ");
            System.out.println("Book Title: " + bookResult.getTitle());
            System.out.println("Book Genre: " + bookResult.getGenre());
            System.out.println("Book Length: " + bookResult.getNumPages());
        }

    }
}
