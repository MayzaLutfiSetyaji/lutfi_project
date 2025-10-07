/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsiuts.mayzalutfisetyaji;

/**
 *
 * @author mayza
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== OUTPUT PRODUK ===");
        
        // Membuat objek Elektronik
        Elektronik laptop = new Elektronik("Laptop", 15000000, 2);
        laptop.tampilkanInfo();
        
        System.out.println();
        
        // Membuat objek Makanan
        Makanan snack = new Makanan("Snack", 15000, "2023-12-30");
        snack.tampilkanInfo();
        
        System.out.println("\n=== OUTPUT PEGAWAI ===");
        
        // Membuat objek PegawaiTetap
        PegawaiTetap budi = new PegawaiTetap("Assep", 5000000, 1000000);
        budi.tampilkanInfo();
        
        System.out.println();
        
        // Membuat objek PegawaiKontrak
        PegawaiKontrak andi = new PegawaiKontrak("Hakkan", 3000000, 12);
        andi.tampilkanInfo();
        
        System.out.println("\n=== OUTPUT POLIMORFISME ===");
        
        // Polimorfisme dengan referensi kelas induk Produk
        Produk produk1 = new Elektronik("Smartphone", 8000000, 1);
        Produk produk2 = new Makanan("Roti'O Lempuyangan", 10000, "2023-11-15");
        
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        
        System.out.println();
        
        // Polimorfisme dengan referensi kelas induk Pegawai
        Pegawai pegawai1 = new PegawaiTetap("Rayfal", 6000000, 1500000);
        Pegawai pegawai2 = new PegawaiKontrak("Rama", 3500000, 6);
        
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
