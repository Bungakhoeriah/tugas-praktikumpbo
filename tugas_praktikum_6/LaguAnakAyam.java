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
public class LaguAnakAyam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah anak ayam : ");

        while (!scanner.hasNextInt()) {
            System.out.println("Masukkan harus berupa angka. Coba Lagi.");
            scanner.next();
        }
        int jumlahAnakAyam = scanner.nextInt();

        //Menggunakan for loop
        System.out.println("Menggunakan for loop");
        for (int i = jumlahAnakAyam; i >= 1; i--) {
            if (i == 1) {
                System.out.println("Anak ayam tinggal " + i + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + i + ", mati satu tinggallah " + (i - 1) + ".");
            }
        }

        //Menggunakan while loop
        System.out.println("\nMenggunakan while loop");
        int j = jumlahAnakAyam;
        while (j >= 1) {
            if (j == 1) {
                System.out.println("Anak ayam tinggal " + j + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + j + ", mati satu tinggallah " + (j - 1) + ".");
            }
            j--;
        }

        //Menggunakan do-while loop
        System.out.println("\nMenggunakan do-while loop");
        int k = jumlahAnakAyam;
        do {
            if (k == 1) {
                System.out.println("Anak ayam tinggal " + k + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + k + ", mati satu tinggallah " + (k - 1) + ".");
            }
            k--;
        } while (k >= 1);

        scanner.close();
    }
}