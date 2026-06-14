/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.proyectozoologico;

/**
 *
 * @author varga
 */
public class Mamifero extends Animal {

    //Atributos
    private String tipoPelaje;
    private double cantidadAlimentoDiario;
    private double costoCuidadosVeterinarios;

    //Constructor
    public Mamifero(String tipoPelaje, double cantidadAlimentoDiario, double costoCuidadosVeterinarios, String id, int edad, double peso, String nombre, String especies, String zonaZoologico, double costoAlimentacion) {
        super(id, edad, peso, nombre, especies, zonaZoologico, costoAlimentacion);
        //Usar setters dentro del constructor para la validacion
        setTipoPelaje(tipoPelaje);
        setCantidadAlimentoDiario(cantidadAlimentoDiario);
        setCostoCuidadosVeterinarios(costoCuidadosVeterinarios);
    }

    //Getters y Setters con las validaciones
    public String getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(String tipoPelaje) {
        if (tipoPelaje.equals("")) {
            System.out.println("El tipo de pelaje no debe estar vacio.");
        } else {
            this.tipoPelaje = tipoPelaje;
        }
    }

    public double getCantidadAlimentoDiario() {
        return cantidadAlimentoDiario;
    }

    public void setCantidadAlimentoDiario(double cantidadAlimentoDiario) {
        if (cantidadAlimentoDiario < 0) {
            System.out.println("La cantidad de Alimento Diario no puede ser negativa");
        } else {
            this.cantidadAlimentoDiario = cantidadAlimentoDiario;
        }
    }

    public double getCostoCuidadosVeterinarios() {
        return costoCuidadosVeterinarios;
    }

    public void setCostoCuidadosVeterinarios(double costoCuidadosVeterinarios) {
        if (costoCuidadosVeterinarios < 0) {
            System.out.println("El costo de cuidados veterinarios no puede ser negativo");
        } else {
            this.costoCuidadosVeterinarios = costoCuidadosVeterinarios;
        }
    }

    // Metodos sobre escritos
    @Override
    public String getTipoAnimal() {
        return "Mamifero";
    }
    
    @Override
    public double calcularCostoMantenimiento() {
        return getCostoAlimentacion() + costoCuidadosVeterinarios;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Tipo de pelaje: " + tipoPelaje);
        System.out.println("Cantidad de alimento diario: " + cantidadAlimentoDiario);
        System.out.println("Costo de cuidados veterinarios: " + costoCuidadosVeterinarios);
    }

    @Override
    public String toString() {
        return "Mamifero{"
                + "tipoPelaje=" + tipoPelaje
                + ", cantidadAlimentoDiario=" + cantidadAlimentoDiario
                + ", costoCuidadosVeterinarios=" + costoCuidadosVeterinarios
                + "} " + super.toString();
    }
}
