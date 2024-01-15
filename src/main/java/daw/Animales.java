/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

/**
 *
 * @author nuria
 */
public class Animales {

        private String especie;
        private double peso;
        private String nombre;
        
        public Animales(String especie, String nombre, double peso){
            this.especie=especie;
            this.nombre=nombre;
            this.peso=peso;
        }
        
        public Animales(){
            
        }

    public String getEspecie() {
        return especie;
    }

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animales{");
        sb.append("especie=").append(especie);
        sb.append(", peso=").append(peso);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

    
        
        
}
