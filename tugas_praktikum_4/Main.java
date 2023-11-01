/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas_praktikum_4;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
       BangunRuang bangunRuang1 = new Balok (3,4,5);
       BangunRuang bangunRuang2 = new Kubus (3);
       
        System.out.println("Luas Permukaan Balok : " + bangunRuang1.hitungLuasPermukaan());
        System.out.println("Volume Balok : " + bangunRuang1.hitungVolume());
        System.out.println();
        System.out.println("Luas Permukaan Kubus : " + bangunRuang2.hitungLuasPermukaan());
        System.out.println("Volume Balok : " + bangunRuang2.hitungVolume());
    }
}
