/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author mayza
 */
public class Pekerja extends Manusia{
    private int gaji; //Atirbut tambahan
            
    //Konstruktor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan); //Memanggil kosntruktor pada class induk
        this.gaji = gaji;
    }
    
    //Getter dan Setter gaji
    public int getGaji() {
        return gaji;
    }
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    //Method toString()
    @Override
    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Usia: " + usia + "\n" +
               "Pekerjaan: " + pekerjaan + "\n" + 
               "Gaji: " + gaji;
    }
}
