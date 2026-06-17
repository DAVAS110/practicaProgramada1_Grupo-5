/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.proyectozoologico;

/**
 *
 * @author varga
 */
public class Pez extends Animal{
    //Atributos
    private String tipoAgua;
    private double tamannoAcuario;
    
    //Constructor
    public Pez(String tipoAgua, double tamannoAcuario, String id, int edad,
        double peso, String nombre, String especies,
        String zonaZoologico, double costoAlimentacion) {

    super(id, edad, peso, nombre, especies,
          zonaZoologico, costoAlimentacion);

    setTipoAgua(tipoAgua);
    setTamannoAcuario(tamannoAcuario);
    
    }
    //Getters and Setter con Validaciones
    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        if (tipoAgua.equals("")) {
            System.out.println("El tipo de agua no debe estar vacio.");
        } else {
            this.tipoAgua = tipoAgua;
        }
    }

    public double getTamannoAcuario() {
        return tamannoAcuario;
    }

    public void setTamannoAcuario(double tamannoAcuario) {
       if (tamannoAcuario <= 0) {
            System.out.println("El tamano del acuario debe ser mayor que cero.");
        } else {
            this.tamannoAcuario = tamannoAcuario;
        }
    }
    
    //Metodos sobreescritos
    @Override
    public String getTipoAnimal() {
        return "Pez";
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        return getCostoAlimentacion() + (tamannoAcuario * 100);
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de agua: " + tipoAgua);
        System.out.println("Tamano del acuario: " + tamannoAcuario);
    }

    @Override
    public String toString() {
        return "Pez{" 
                + "tipoAgua=" + tipoAgua 
                + ", tamannoAcuario=" + tamannoAcuario 
                + "} " + super.toString();
    }
    
}
