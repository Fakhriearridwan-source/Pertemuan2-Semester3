/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.JOptionPane;
/**
 *
 * @author hi
 */
public class ATM_ProseduralJOP {public static void main(String[] args) {
        int PINbenar = 123456;
        int Saldo = 500000000;
        int percobaan = 0;
        
        while (true) {
            String inputPIN = JOptionPane.showInputDialog(null, "Masukkan PIN:", "Login ATM", JOptionPane.QUESTION_MESSAGE);
            
            // Jika user menekan Cancel atau menutupi dialog
            if (inputPIN == null) {
                JOptionPane.showMessageDialog(null, "Transaksi dibatalkan.", "ATM", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            
            try {
                int PIN = Integer.parseInt(inputPIN);
                
                if (PIN == PINbenar) {
                    percobaan = 0;
                    
                    while (true) {
                        String menu = "---- PILIHAN MENU -----\n"
                                    + "1. Cek Saldo\n"
                                    + "2. Tarik Tunai\n"
                                    + "3. Setor Tunai\n"
                                    + "4. Keluar\n\n"
                                    + "Masukkan pilihan (1-4):";
                        
                        String inputPilihan = JOptionPane.showInputDialog(null, menu, "Menu Utama ATM", JOptionPane.QUESTION_MESSAGE);
                        
                        if (inputPilihan == null) {
                            JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan ATM");
                            System.exit(0);
                        }
                        
                        int pilihan = Integer.parseInt(inputPilihan);
                        
                        if (pilihan == 1) {
                            JOptionPane.showMessageDialog(null, "Saldo anda : Rp " + Saldo, "Cek Saldo", JOptionPane.INFORMATION_MESSAGE);
                        } 
                        else if (pilihan == 2) {
                            String inputTarik = JOptionPane.showInputDialog(null, 
                                    "Saldo anda : Rp " + Saldo + "\nMasukkan jumlah yang ingin ditarik:", 
                                    "Tarik Tunai", JOptionPane.QUESTION_MESSAGE);
                            
                            if (inputTarik != null) {
                                int JumlahTarik = Integer.parseInt(inputTarik);
                                
                                if (JumlahTarik <= Saldo) {
                                    Saldo -= JumlahTarik;
                                    JOptionPane.showMessageDialog(null, 
                                            "Transaksi telah berhasil!!\nSaldo anda sekarang : Rp " + Saldo, 
                                            "Tarik Tunai Sukses", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(null, 
                                            "Transaksi gagal! Saldo anda kurang.", 
                                            "Gagal", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        } 
                        else if (pilihan == 3) {
                            String inputSetor = JOptionPane.showInputDialog(null, 
                                    "Saldo anda : Rp " + Saldo + "\nMasukkan jumlah setor:", 
                                    "Setor Tunai", JOptionPane.QUESTION_MESSAGE);
                            
                            if (inputSetor != null) {
                                int JumlahSetor = Integer.parseInt(inputSetor);
                                Saldo += JumlahSetor;
                                JOptionPane.showMessageDialog(null, 
                                        "Setor berhasil!!\nSaldo anda sekarang : Rp " + Saldo, 
                                        "Setor Tunai Sukses", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } 
                        else if (pilihan == 4) {
                            JOptionPane.showMessageDialog(null, "Terima kasih telah menggunakan ATM", "Keluar", JOptionPane.INFORMATION_MESSAGE);
                            System.exit(0);
                        } 
                        else {
                            JOptionPane.showMessageDialog(null, "Pilihan tidak valid! Silakan pilih 1-4.", "Error", JOptionPane.WARNING_MESSAGE);
                        }
                    }
                } else {
                    percobaan++;
                    if (percobaan >= 3) {
                        JOptionPane.showMessageDialog(null, 
                                "PIN anda terblokir karena lebih dari 3 kali percobaan salah!!!", 
                                "Terblokir", JOptionPane.ERROR_MESSAGE);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, 
                                "PIN salah! Percobaan ke " + percobaan + " dari 3", 
                                "Peringatan", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input harus berupa angka!", "Error Input", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}