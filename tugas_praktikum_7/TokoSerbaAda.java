/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas_praktikum_7;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Menentukan jumlah barang yang akan dimasukkan
        System.out.print("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();

        //Array untuk menyimpan informasi barang
        String[] kodeBarang = new String[jumlahBarang];
        String[] namaBarang = new String[jumlahBarang];
        double[] hargaBarang = new double[jumlahBarang];
        int[] jumlahBeli = new int[jumlahBarang];
        double[] jumlahBayar = new double[jumlahBarang];

        //Input informasi barang
        for (int i = 0; i < jumlahBarang; i++) {
            System.out.println("\nMasukkan informasi barang ke-" + (i + 1) + ": ");
            System.out.print("Kode Barang: ");
            kodeBarang[i] = scanner.next();
            System.out.print("Nama Barang: ");
            namaBarang[i] = scanner.next();
            System.out.print("Harga Barang: ");
            hargaBarang[i] = scanner.nextDouble();
            System.out.print("Jumlah Beli: ");
            jumlahBeli[i] = scanner.nextInt();

            //Menghitung jumlah bayar untuk setiap barang
            jumlahBayar[i] = hargaBarang[i] * jumlahBeli[i];
        }

        //Output informasi barang
        System.out.println("\n====================================================================================");
        System.out.printf("| %-4s | %-10s | %-15s | %-6s | %-10s | %-12s |\n",
                "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah Beli", "Jumlah Bayar");
        System.out.println("======================================================================================");

        for (int i = 0; i < jumlahBarang; i++) {
            System.out.printf("| %-2d | %-12s | %-20s | %-10.2f | %-12d | %-15.2f |\n",
                    (i + 1), kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
        }

        System.out.println("=======================================================================================");

        //Menghitung total pembelian
        double totalPembelian = 0;
        for (double bayar : jumlahBayar) {
            totalPembelian += bayar;
        }

        System.out.println("\nTotal Pembelian: " + totalPembelian);

        scanner.close();
    }
}
