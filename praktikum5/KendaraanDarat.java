/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author mayza
 */
public class KendaraanDarat extends Kendaraan{
    String kendaraanDarat;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Kendaraan operasional: " + kendaraanDarat);
    }
}
