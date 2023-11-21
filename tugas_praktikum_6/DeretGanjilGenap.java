/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas_praktikum_6;

/**
 *
 * @author User
 */
public class DeretGanjilGenap {
    public static void main(String[] args) {
        System.out.print("Deret Ganjil : ");
        int ganjil = 1;
        while (ganjil <= 20) {
            System.out.print(ganjil + " ");
            ganjil += 2;
        }
        System.out.println();

        System.out.print("Deret Genap : ");
        int genap = 0;
        while (genap <= 20) {
            System.out.print(genap + " ");
            genap += 2;
        }
    }
}