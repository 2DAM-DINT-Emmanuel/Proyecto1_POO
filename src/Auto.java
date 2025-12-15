/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emmnavmoj
 */
public class Auto extends Vehiculo{
    
    // Atributo
    private String tipoCombustible;
    
    // Constructor de la clase padre y le añadimos el atributo de esta clase
    public Auto(String marca, String color, String tipoCombustible) {
        super(marca, color);
        this.tipoCombustible = tipoCombustible;
    }

    // Método mostrarInfo de la clase Vehículo
    @Override
    public String mostrarInfo() {
       return "AUTO\nMarca: " + getMarca() +
               "\nColor: " + getColor() +
               "\nTipo de combustible: " + tipoCombustible +
               "Mi primer commit";
       
    }
    

    
    // Get
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    // Set
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    
    
    
    
    
    
    
}
