/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author mayza
 */
public class MainTugas {
    public static void main(String[] args) {
        Pekerja karyawan = new Pekerja("Hakkan", 69, "Tukang Roti`O Lempuyangan", 2100000);
        System.out.println("\n====Data Lama====");
        System.out.println(karyawan);
        
        karyawan.setNama("Azrul");
        System.out.println("\n====Data telah dirubah====");
        System.out.println(karyawan);
    }
}
