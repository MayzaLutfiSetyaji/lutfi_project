/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author mayza
 */
public class Kendaraan {
    private String nama; //hanya bisa diakses pada class ini
    protected int kecepatanMaks; //Hanya bisa diakses pad package dan subclass yang sama
    public String jenisMesin; //bisa diakses dari mana saja
    
    //Konstruktor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
      this.nama = nama;
      this.kecepatanMaks = kecepatanMaks;
      this.jenisMesin = jenisMesin;
      }
    //Getter dan Setter untuk nama
    public String getNama() {
      return nama;
      }
    public void setNama(String nama) {
      this.nama = nama;  
      }
    //Method public untuk menampilkan informasi kendaraan
    public void infoKendaraan() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan Maksimal: " + kecepatanMaks + " km/jam");
        System.out.println("Jenis Mesin: " + jenisMesin);
        
        
    }
    
}
