/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lenovo
 */
class Admin extends User {
    public Admin(String username) {
        super(username);
    }

    public void addBook(List<LibraryItem> library, LibraryItem book) {
        library.add(book);
        System.out.println("Added book: " + book.getTitle() + " to the library.");
    }

    public void deleteBook(List<LibraryItem> library, LibraryItem book) {
        library.remove(book);
        System.out.println("Deleted book: " + book.getTitle() + " from the library.");
    }
}