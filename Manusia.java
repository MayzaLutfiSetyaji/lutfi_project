/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author mayza
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    //Konstruktor
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    //Getter dan Setter nama
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    //Getter dan Setter usia
    public int getUsia() {
        return usia;
    }
    public void setUsia(int Usia) {
        this.usia = usia;
    }
    //Getter dan Setter pekerjaan
    public String getPekerjaan() {
        return pekerjaan;
    }
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }
}

