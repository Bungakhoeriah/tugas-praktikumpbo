/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uts_praktikum;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        List<LibraryItem> library = new ArrayList<>();

        LibraryItem book1 = new LibraryItem("Book 1", "Author 1", "Fiction") {};
        LibraryItem book2 = new LibraryItem("Book 2", "Author 2", "Non-Fiction") {};

        User user1 = new User("User1");
        Admin admin1 = new Admin("Admin1");

        admin1.addBook(library, book1);
        admin1.addBook(library, book2);

        user1.viewBooks(library);

        admin1.deleteBook(library, book2);

        user1.viewBooks(library);
    }
}
