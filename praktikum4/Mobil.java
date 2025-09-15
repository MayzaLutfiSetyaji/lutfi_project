/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author mayza
 */
public class Mobil extends Kendaraan{ //Subclass kendaraan
    private int jumlahPintu; //Atribut tambahan khusus untuk mobil
    
    //Konstruktor
    public Mobil(String nama, int kecepatanMaks, String jenisMesin, int jumlahPintu) {
       super(nama, kecepatanMaks, jenisMesin); //Memanggil konstruktor dari kelas induk
       this.jumlahPintu = jumlahPintu;
    }
    
    //Method untuk menampilkan informasi mobil
   public void infoMobil() {
       //Dapat mengakses kecepatanMaks karena protected
       System.out.println("Kecepatan maksimum mobil: " + kecepatanMaks + " km/jam");
       System.out.println("Jumlah pintu: " + jumlahPintu);
    }
  
        
    
}
