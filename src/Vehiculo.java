/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emmnavmoj
 */
public class Vehiculo {
    
    // Atributos
    private String marca;
    private String color;
    
    // Constructor
    public Vehiculo(String marca, String color){
        this.marca = marca;
        this.color = color;
    }
    
    // Método que devuelve la información del vehículo
    public String mostrarInfo(){
        return "El vehiculo es de la marca: " + marca + " y es de color: " + color;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
