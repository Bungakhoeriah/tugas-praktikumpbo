/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.uts_praktikum;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = input.nextLine();

        Hewan hewan;

        if (jenisHewan.equalsIgnoreCase("Kucing")) {
            hewan = new Kucing();
        } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak dikenal.");
            return;
        }

        hewan.bersuara();

        if (hewan instanceof Kucing || hewan instanceof Anjing) {
            System.out.println("Hewan ini adalah mamalia.");
        } else {
            System.out.println("Hewan ini bukan mamalia.");
        }
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
