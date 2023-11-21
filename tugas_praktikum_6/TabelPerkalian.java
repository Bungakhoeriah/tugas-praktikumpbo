/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas_praktikum_6;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n : "); //Masukkan angka <10

        while (!scanner.hasNextInt()) {
            System.out.println("Masukkan harus berupa angka. Coba Lagi.");
            scanner.next();
        }
        int n = scanner.nextInt();

        if (n <= 0 || n > 10) {
            System.out.println("Nilai n harus lebih dari 0 dan tidak lebih dari 10.");
            return;
        }

        System.out.println("\nTabel Perkalian " + n + " x " + n + ":");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}