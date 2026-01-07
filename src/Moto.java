/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emmnavmoj
 */
public class Moto extends Vehiculo {
    
    // Atributo
    private int cilindrada;

    // Constructor de la clase padre y le añadimos el atributo de la clase actual
    public Moto(String marca, String color, int cilindrada) {
        super(marca, color);
        this.cilindrada = cilindrada;
    }

    // Método mostrarInfo de la clase Vehículo
    @Override
    public String mostrarInfo() {
        return "MOTO\nMarca: " + getMarca() +
               "\nColor: " + getColor() +
               "\nCilindrada: " + cilindrada + " cc";
    }
 
    // Get
    public int getCilindrada() {
        return cilindrada;
    }

    // Set
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
