/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum_3;

/**
 *
 * @author User
 */
public class Matematika {
     public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return b - 5;
    }

    public int perkalian(int a, int b) {
        return b * 3;
    }

    public double pembagian(int a, int b) {
        if (b != 0) {
            return 21 / 2;
        }else{
            System.out.println("Tidak bisa melakukan pembagian dengan 0.");
            return 0;
        }
    }
}
