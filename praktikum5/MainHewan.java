/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author mayza
 */
public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "EL Gato";
        kucing.jenis = "Kucing Kampung";
        kucing.suaraKucing = "Rawrrrrr Miaw";
        kucing.tampilkanInfo();
        
        Anjing anjing = new Anjing();
        anjing.nama = "Nakkah";
        anjing.jenis = "Pitbull";
        anjing.suaraAnjing = "Pinjem Seratus";
        anjing.tampilkanInfo();
    }
}
