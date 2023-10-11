/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Nilai {
      String nama,nim;
    int absen, tugas, uts, uas, akhir;
    int Nilai(){
        akhir = (absen * 10/100) + (tugas * 20/100) + (uts * 30/100) + (uas * 40/100);
        return akhir;
    }
    void CetakNilai(){
        
        System.out.println("NIM                 : " +this.nim);
        System.out.println("Nama                : " +this.nama);
        System.out.println("Nilai Absen [10%]   : " +this.absen);
        System.out.println("Nilai Tugas [20%]   : " +this.tugas);
        System.out.println("Nilai UTS [30%]     : " +this.uts);
        System.out.println("Nilai UAS [40%]     : " +this.uas);
        System.out.println("Nilai Akhir         : " +Nilai());
        }
}
