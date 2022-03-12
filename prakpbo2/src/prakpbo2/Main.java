/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakpbo2;

import java.util.Scanner;

/**
 *
 * @author Suyoto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang, lebar, tinggi, jarijari;
        int pilih,ulang=0;
        do{
            System.out.println("+=====================+");
            System.out.println("|     MENU UTAMA      |");
            System.out.println("+=====================+");
            System.out.println("1. Menu Balok");
            System.out.println("2. Menu Tabung");
            System.out.println("0. Exit");
            System.out.print("Pilih : ");pilih=input.nextInt();
            if(pilih==1){
            System.out.print("Input Panjang : ");panjang=input.nextDouble();
            System.out.print("Input Lebar : ");lebar=input.nextDouble();
            System.out.print("Input Tinggi : ");tinggi=input.nextDouble();
            
            Balok balok=new Balok(tinggi, panjang, lebar);
            System.out.println("Luas Persegi Panjang : " + balok.luas());
                System.out.println("keliling Persegi Panjang : " + balok.keliling());
                System.out.println("Volume Persegi Panjang : " + balok.volume());
                System.out.println("Luas Permukaan Persegi Panjang : " + balok.luaspermukaan());
                System.out.print("Ulangi (Ya:1 || Tidak:0)? ");ulang=input.nextInt();
            }
            else if(pilih==2){
                System.out.print("Input Jari - Jari : ");jarijari=input.nextDouble();
            System.out.print("Input Tinggi : ");tinggi=input.nextDouble();
            
            Tabung tabung=new Tabung(tinggi, jarijari);
            System.out.println("Luas Lingkaran : " + tabung.luas());
                System.out.println("keliling Lingkaran : " + tabung.keliling());
                System.out.println("Volume Tabung : " + tabung.volume());
                System.out.println("Luas Permukaan Tabung : " + tabung.luaspermukaan());
                System.out.print("Ulangi (Ya:1 || Tidak:0)? ");ulang=input.nextInt();
            }
        }while(pilih!=0 && ulang!=0 );
               
    }
    
}
