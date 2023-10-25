/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_praktikum_3;

/**
 *
 * @author User
 */
public class Matematika2 extends Matematika {
    public int modulus (int a, int b) {
        if (b != 0) {
            return a % b;
        }else{
            System.out.println("Tidak bisa melakukan modulus dengan 0.");
            return 0;
        }
    }
}
