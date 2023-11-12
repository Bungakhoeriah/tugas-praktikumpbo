/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_praktikum;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void viewBooks(List<LibraryItem> library) {
        for (LibraryItem item : library) {
            System.out.println("Title: " + item.getTitle() + ", Author: " + item.getAuthor() + ", Genre: " + item.getGenre());
        }
    }
}
