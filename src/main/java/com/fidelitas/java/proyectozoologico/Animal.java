/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fidelitas.java.proyectozoologico;

/**
 *
 * @author varga
 */
public abstract class Animal implements Cuidable{

    //Atributos
    private String id;
    private int edad;
    private double peso;
    private String nombre;
    private String especies;
    private String zonaZoologico;
    private double costoAlimentacion;
    private double costoMantenimiento;

    //Constructores
    public Animal(String id, int edad, double peso, String nombre, String especies, String zonaZoologico, double costoAlimentacion) {
        //Usar setters dentro del constructor para la validacion
        setId(id);
        setEdad(edad);
        setPeso(peso);
        setNombre(nombre);
        setEspecies(especies);
        setZonaZoologico(zonaZoologico);
        setCostoAlimentacion(costoAlimentacion);
    }

    //Metodo polimorfico
    public abstract double calcularCostoMantenimiento();

    //Getters y Setters y validarlos 
    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.equals("")) {
            System.out.println("El identificador del animal no debe estar vacío.");
        } else {
            this.id = id;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa. ");
        } else {
            this.edad = edad;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("El peso debe ser mayor que cero.");
        } else {
            this.peso = peso;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.equals("")) {
            System.out.println("El nombre del animal no debe estar vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    public String getEspecies() {
        return especies;
    }

    public void setEspecies(String especies) {
        if (especies.equals("")) {
            System.out.println("La especie no debe estar vacia.");
        } else {
            this.especies = especies;
        }
    }

    public String getZonaZoologico() {
        return zonaZoologico;
    }

    public void setZonaZoologico(String zonaZoologico) {
        if (zonaZoologico.equals("")) {
            System.out.println("La zona del zoológico no debe estar vacía. ");
        } else {
            this.zonaZoologico = zonaZoologico;
        }
    }

    public double getCostoMantenimiento() {
        return costoMantenimiento;
    }

    public void setCostoMantenimiento(double costoMantenimiento) {
        if (costoMantenimiento < 0) {
            System.out.println("El costo de mantenimiento debe ser mayor o igual que cero.");
        } else {
            this.costoMantenimiento = costoMantenimiento;
        }
    }

    public double getCostoAlimentacion() {
        return costoAlimentacion;
    }

    public void setCostoAlimentacion(double costoAlimentacion) {
        if (costoAlimentacion < 0) {
            System.out.println("El costo de alimentacion no puede ser negativo.");
        } else {
            this.costoAlimentacion = costoAlimentacion;
        }
    }
    
    public String getTipoAnimal() {
        return "Animal";
    }
    
    //Metodos 
    public void mostrarDatos() {
        System.out.println("Identificador: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de animal: " + getEspecies());
        System.out.println("Especie: " + especies);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Zona: " + zonaZoologico);
        System.out.println("Costo de alimentacion: " + costoAlimentacion);
        System.out.println("Costo mensual de mantenimiento: " + calcularCostoMantenimiento());
    }

    @Override
    public String toString() {
        return "Animal{"
                + "identificador=" + id
                + ", nombre=" + nombre
                + ", especie=" + especies
                + ", edad=" + edad
                + ", peso=" + peso
                + ", zona=" + zonaZoologico
                + ", costoAlimentacion=" + costoAlimentacion
                + '}';
    }
}
