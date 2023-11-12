/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_praktikum;

/**
 *
 * @author User
 */
public class Hewan {
  protected String jenisSuara;

public Hewan(String jenisSuara){
    this.jenisSuara = jenisSuara;
}  

public void bersuara(){
    System.out.println("Suara Hewan ini ialah : " + jenisSuara);
    }
}
