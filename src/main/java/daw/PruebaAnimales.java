/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author nuria
 */
public class PruebaAnimales {
    public static void main(String[] args) {

        Animales miAnimal = new Animales("Perro", "Pepe", 10.5);
        System.out.println(miAnimal);
        
        Animales animalSinParametros = new Animales();
        System.out.println(animalSinParametros);
        
    }
}
