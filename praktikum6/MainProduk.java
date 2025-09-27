/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author mayza
 */
public class MainProduk {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        keranjang.tambahProduk(new Buku("Statistika", 70000));
        keranjang.tambahProduk(new Elektronik("Keyboard", 100000));
        keranjang.tambahProduk(new Pakaian("Kaos Distro", 50000));
        
        System.out.println("Total: Rp. " + keranjang.hitungTotal());
    }
}
