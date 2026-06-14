/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.proyectozoologico;

/**
 *
 * @author varga
 */
public class Reptil extends Animal {
    //Atributos
    private String tipoHabitat;
    private double temperaturaRequerida;
    
    //Constructor
    public Reptil(String tipoHabitat, double temperaturaRequerida, String id, int edad, double peso, String nombre, String especies, String zonaZoologico, double costoAlimentacion) {
        super(id, edad, peso, nombre, especies, zonaZoologico, costoAlimentacion);
        this.tipoHabitat = tipoHabitat;
        this.temperaturaRequerida = temperaturaRequerida;
    }
    
    //Setters and Getter con Validaciones
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        if (tipoHabitat.equals("")) {
            System.out.println("El tipo de habitat no debe estar vacio.");
        } else {
            this.tipoHabitat = tipoHabitat;
        }
    }

    public double getTemperaturaRequerida() {
        return temperaturaRequerida;
    }

    public void setTemperaturaRequerida(double temperaturaRequerida) {
        if (temperaturaRequerida <= 0) {
            System.out.println("La temperatura requerida debe ser mayor que cero.");
        } else {
            this.temperaturaRequerida = temperaturaRequerida;
        }
    }
    
    //Metodos sobreescritos
    @Override
    public String getTipoAnimal() {
        return "Reptil";
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        return getCostoAlimentacion() + (temperaturaRequerida * 500);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de habitat: " + tipoHabitat);
        System.out.println("Temperatura requerida: " + temperaturaRequerida);
    }

    @Override
    public String toString() {
        return "Reptil{" 
                + "tipoHabitat=" + tipoHabitat 
                + ", temperaturaRequerida=" + temperaturaRequerida 
                + "} " + super.toString();
    }
}
