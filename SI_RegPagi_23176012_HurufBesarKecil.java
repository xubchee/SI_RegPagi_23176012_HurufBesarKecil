/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan.pertemuan6;

import java.util.Scanner;

/**
 *  Nama      : MOHAMMAD FAJAR SUBECHI
 *  NIM       : 23176012
 *  Prodi     : Sistem InfOrmasi
 *  Deskripsi : program ini untuk mengubah huruf besar dan huruf kecil
 * @author ACER
 */
public class SI_RegPagi_23176012_HurufBesarKecil {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean ulangi = true;

        while (ulangi) {            
            System.out.print("Masukan Kalimat : ");
            String kalimat = input.nextLine();
            
            String kalimatKecil = kalimat.toLowerCase();
            String kalimatBesar = kalimat.toUpperCase();
            
            System.out.println("\n===== Hasil formatting =====");
            System.out.println("HurufBesar = " +kalimatBesar);
            System.out.println("HurufKecil = " +kalimatKecil);
            
            System.out.print("\nUlangi Program? (ya/tidak)");
            String ulang = input.nextLine().toUpperCase();
            if(ulang.equals("YA")){
                System.out.println("Program akan diulangi\n");
            }else if(ulang.equals("TIDAK")){
                System.out.println("Program berhenti terimakasih\n");
                ulangi = false;
            }
        }

    }    
}
