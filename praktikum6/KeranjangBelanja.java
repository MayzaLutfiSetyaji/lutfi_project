/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author mayza
 */
import java.util.ArrayList;
public class KeranjangBelanja {
    ArrayList<Produk> produkList;
    
    KeranjangBelanja() {
        produkList = new ArrayList<>();
    }
    
    void tambahProduk(Produk produk) {
        produkList.add(produk);
    }
    
    double hitungTotal() {
        double total = 0;
        for (Produk p: produkList) {
            total += p.harga - p.hitungDiskon();
        }
        return total;
    }
}
