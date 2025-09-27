/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author mayza
 */
public class Elektronik extends Produk{
    Elektronik(String nama, double harga) {
        super(nama, harga);
    }
       
    @Override
    double hitungDiskon() {
        return harga * 0.5;
    }
}
