/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import java.util.Scanner;
/**
 *
 * @author hi
 */
public class ATM_Prosedural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int PINbenar = 123456;
        int Saldo = 50000000;
        int percobaan = 0;
        
        while(true){
        System.out.print("Masukan PIN: ");
        int PIN = input.nextInt(); 
        
        if ( PIN == PINbenar){
            percobaan = 0;
            
            while(true){
            System.out.println("---- PILIHAN MENU -----");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Setor Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukan pilihan: ");
            int pilihan = input.nextInt();
                if(pilihan == 1){
                    System.out.println("Saldo anda : " + Saldo);
                    
                    while(true){
                    System.out.print("Tekan 0 untuk kembali : ");
                    int Tombolkembali = input.nextInt();
                    if(Tombolkembali == 0){
                      break;
                    }
                    else{
                        System.out.print("TOMBOL KEMBALI ANGKA 0!! SILAHKAN ULANGI!!: ");
                     } 
                    }
                 }
                else if(pilihan == 2){
                    System.out.println("--- Menu Tarik Tunai ---");
                    System.out.println("Saldo anda :"+ Saldo);
                    System.out.print("Jumlah yang ingin anda tarik : ");
                    int JumlahTarik = input.nextInt();
                    
                    if(JumlahTarik <= Saldo){
                    Saldo = Saldo - JumlahTarik;
                    System.out.println("Transaksi telah berhasil!!");
                    System.out.println("Saldo anda sekarang : " + Saldo);
                    } 
                    else{
                        System.out.println("Transaksi gagal! Saldo anda kurang");
                    }
                    while(true){
                    System.out.print("Tekan 0 untuk kembali : ");
                    int Tombolkembali = input.nextInt();
                    if(Tombolkembali == 0){
                      break;
                    }
                    else{
                        System.out.print("TOMBOL KEMBALI ANGKA 0!! SILAHKAN ULANGI!!: ");
                     } 
                    }
                }
                else if(pilihan == 3){
                    System.out.println("--- Menu Setor Tunai ---");
                    System.out.println("Saldo anda : "+ Saldo);
                    System.out.print("Masukan Setor : ");
                    int JumlahSetor = input.nextInt();
                    Saldo = Saldo + JumlahSetor;
                    System.out.println(" Setor berhasil!! Saldo anda sekarang : " + Saldo);
                    while(true){
                    System.out.print("Tekan 0 untuk kembali : ");
                    int Tombolkembali = input.nextInt();
                    if(Tombolkembali == 0){
                      break;
                    }
                    else{
                        System.out.print("TOMBOL KEMBALI ANGKA 0!! SILAHKAN ULANGI!!: ");
                     } 
                    }
                }
                else if(pilihan == 4){
                    System.out.println("Terima kasih telah menggunakan ATM");
                    //break;
                    System.exit(0);
                }
         } 
        }
        else {
            percobaan++;
            System.out.println("PIN salah! percobaan ke "+ percobaan + " dari 3");
            
            if (percobaan >= 3){
                System.out.println("PIN anda terblokir karena lebih dari 3 percobaan!!!");
                break;
            }
            System.out.println();
            continue;
        }    
      }
    }
}