/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.proyectozoologico;

/**
 *
 * @author varga
 */
public class Ave extends Animal{
    //Atributos 
    private double tamanoAlas;
    private String puedeVolar;
    
    //Constructor
    public Ave(double tamanoAlas, String puedeVolar, String id, int edad, double peso, String nombre, String especies, String zonaZoologico, double costoAlimentacion) {
        super(id, edad, peso, nombre, especies, zonaZoologico, costoAlimentacion);
       setTamanoAlas(tamanoAlas);
       setPuedeVolar(puedeVolar);
    }
    
    //Getters y Setters con validaciones
    public double getTamanoAlas() {
        return tamanoAlas;
    }

    public void setTamanoAlas(double tamanoAlas) {
        if (tamanoAlas <= 0) {
            System.out.println("El tamano de las alas debe ser mayor que cero.");
        } else {
            this.tamanoAlas = tamanoAlas;
        }
    }

    public String getPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(String puedeVolar) {
        if (puedeVolar.equals("")) {
            System.out.println("Debe indicar si el ave puede volar.");
        } else {
            this.puedeVolar = puedeVolar;
        }
    }  
    
    //Metodos sobreescritos
    @Override
    public String getTipoAnimal() {
        return "Ave";
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        if (puedeVolar.equals("Si")) {
            return getCostoAlimentacion() + (tamanoAlas * 1000) + 5000;
        } else {
            return getCostoAlimentacion() + (tamanoAlas * 1000) + 3000;
        }
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tamano de alas: " + tamanoAlas);
        System.out.println("Puede volar: " + puedeVolar);
    }

    @Override
    public String toString() {
        return "Ave{" 
                + "tamanoAlas=" + tamanoAlas 
                + ", puedeVolar=" + puedeVolar 
                + "} " + super.toString();
    }
}
