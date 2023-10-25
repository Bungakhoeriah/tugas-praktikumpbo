/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tugas_praktikum_3;

/**
 *
 * @author User
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();
      
      double celsius = 25.0;
      double fahrenheit = konversiSuhu2.celciusToFahrenheit(celsius);
      double reamur = konversiSuhu2.celciusToReamur(celsius);
      double fahrenheitToReamur = konversiSuhu2.fahrenheitToReamur(fahrenheit);
      
        System.out.println("Celsius ke Fahrenheit : " +fahrenheit);
        System.out.println("Celsius ke Reamur : " +reamur);
        System.out.println("Fahrenheit ke Reamur : " +fahrenheitToReamur);
      
    }
    
}
