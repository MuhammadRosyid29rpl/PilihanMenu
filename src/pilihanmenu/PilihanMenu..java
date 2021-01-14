/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilihanmenu;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class PilihanMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int pilihan=9;//tipedata integer
    do { //melakukan pilihan
        System.out.println("\nMenu Luas Bangun\n");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Luas Persegi Panjang");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan");
        pilihan=input.nextInt();
    //statement
    switch (pilihan){
        case 1 :LuasPersegi();break;
        case 2 :LuasPersegiPanjang();break;
        
    }   
    }while (pilihan !=3);
    }
    
    
//methodbaruuntuk menghitung luas persegi
    private static void LuasPersegi() {
    Scanner input = new Scanner (System.in);
    float sisi,luas;
        System.out.print("Masukkan nilai sisi : ");
        sisi=input.nextFloat();
        luas=sisi*sisi;
        System.out.println("Luas Persegi adalah : "+luas);
    }
//untuk menghitung luas persegipanjang
    private static void LuasPersegiPanjang() {
    Scanner input = new Scanner (System.in);
    float panjang,lebar,luas;
        System.out.print("Masukkan nilai panjang : ");
        panjang=input.nextFloat();
        System.out.print("Masukkan nilai lebar : ");
        lebar=input.nextFloat();
        luas=panjang*lebar;
        System.out.println("Luas Persegi Panjang adalah : "+luas);
    }
    
}
