/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas_praktikum_6;

/**
 *
 * @author User
 */
public class DeretBilangan {
    public static boolean cekPrima(int angka) {
        if (angka > 1) {
            for (int i = 2; i <= angka / 2; i++) {
                if (angka % i == 0) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] deretPrima = new int[21];
        int[] deretBukanPrima = new int[21];

        int indexPrima = 0;
        int indexBukanPrima = 0;

        for (int angka = 0; angka <= 20; angka++) {
            if (cekPrima(angka)) {
                deretPrima[indexPrima++] = angka;
            } else {
                deretBukanPrima[indexBukanPrima++] = angka;
            }
        }
        System.out.print("Deret Bilangan Prima : ");
        for (int i = 0; i < indexPrima; i++) {
            System.out.print(deretPrima[i] + " ");
        }
        System.out.println();

        System.out.print("Deret Bukan Bilangan Prima : ");
        for (int i = 0; i < indexBukanPrima; i++) {
            System.out.println(deretBukanPrima[i] + " ");
        }
    }
}
