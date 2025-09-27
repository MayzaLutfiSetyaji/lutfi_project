/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author mayza
 */
public class Main {
    public static void main(String[] args) {
        Hewan hewan = new Kucing();
        hewan.bersuara(); // Output: Meow
        
        Kucing kucing = new Kucing();
        kucing.makan("Ikan"); //Memanggil method makan() dari class Hewan
        kucing.makan("ikan", 2); //Memanggil method makan() yang overload
        
        Anjing anjing = new Anjing();
        anjing.bersuara(); //Output: Woof
        anjing.makan("daging", 3); //Memanggil method makan() yang overloaded pada class Hewan
        
    }
}
