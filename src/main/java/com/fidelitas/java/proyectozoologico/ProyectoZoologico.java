/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fidelitas.java.proyectozoologico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author varga
 */
public class ProyectoZoologico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Animal> animales = new ArrayList<Animal>();

        int opcion = 0;

        do {
            try {
                System.out.println("======================================");
                System.out.println("        SISTEMA DE ZOOLOGICO");
                System.out.println("======================================");
                System.out.println("1. Registrar animal");
                System.out.println("2. Listar animales");
                System.out.println("3. Ver reporte");
                System.out.println("4. Salir");
                System.out.println("======================================");
                System.out.print("Digite una opcion: ");

                opcion = entrada.nextInt();
                entrada.nextLine();

                if (opcion == 1) {
                    registrarAnimal(entrada, animales);
                } else if (opcion == 2) {
                    listarAnimales(animales);
                } else if (opcion == 3) {
                    verReporte(animales);
                } else if (opcion == 4) {
                    System.out.println("Saliendo del sistema...");
                } else {
                    System.out.println("Opcion incorrecta.");
                }

            } 
            catch (Exception e) {
                System.out.println("Error: debe ingresar un dato valido.");
                System.out.println("Recuerde: si digita decimales, use coma. Ejemplo: 0,2");
                entrada.nextLine();
            }

            System.out.println();

        } while (opcion != 4);
    }

    public static void registrarAnimal(Scanner entrada, ArrayList<Animal> animales) {

        System.out.println("======================================");
        System.out.println("          REGISTRO DE ANIMAL");
        System.out.println("======================================");
        System.out.println("1. Mamifero");
        System.out.println("2. Ave");
        System.out.println("3. Reptil");
        System.out.println("4. Pez");
        System.out.print("Seleccione el tipo de animal: ");

        int tipoAnimal = entrada.nextInt();
        entrada.nextLine();

        if (tipoAnimal < 1 || tipoAnimal > 4) {
            System.out.println("Tipo de animal incorrecto.");
            return;
        }

        System.out.print("Identificador: ");
        String id = entrada.nextLine();

        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Especie: ");
        String especies = entrada.nextLine();

        System.out.print("Edad en anios: ");
        int edad = entrada.nextInt();

        System.out.print("Peso en Kg, use coma si tiene decimales: ");
        double peso = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Zona del zoologico(Norte, Sur, Este, Oeste): ");
        String zonaZoologico = entrada.nextLine();

        System.out.print("Costo de alimentacion mensual en dolares, use coma si tiene decimales: ");
        double costoAlimentacion = entrada.nextDouble();
        entrada.nextLine();

        if (id.equals("")) {
            System.out.println("El identificador no debe estar vacio.");
            return;
        }

        if (nombre.equals("")) {
            System.out.println("El nombre no debe estar vacio.");
            return;
        }

        if (especies.equals("")) {
            System.out.println("La especie no debe estar vacia.");
            return;
        }

        if (edad <= 0) {
            System.out.println("La edad debe ser un numero natural mayor que cero.");
            return;
        }

        if (peso <= 0) {
            System.out.println("El peso debe ser mayor que cero.");
            return;
        }

        if (zonaZoologico.equals("")) {
            System.out.println("La zona no debe estar vacia.");
            return;
        }

        if (costoAlimentacion < 0) {
            System.out.println("El costo de alimentacion no puede ser negativo.");
            return;
        }

        if (tipoAnimal == 1) {

            System.out.print("Tipo de pelaje: ");
            String tipoPelaje = entrada.nextLine();

            System.out.print("Cantidad de alimento diario en Kg, use coma si tiene decimales: ");
            double cantidadAlimentoDiario = entrada.nextDouble();

            System.out.print("Costo de cuidados veterinarios en dolares, use coma si tiene decimales: ");
            double costoCuidadosVeterinarios = entrada.nextDouble();
            entrada.nextLine();

            if (tipoPelaje.equals("")) {
                System.out.println("El tipo de pelaje no debe estar vacio.");
                return;
            }

            if (cantidadAlimentoDiario < 0) {
                System.out.println("La cantidad de alimento diario no puede ser negativa.");
                return;
            }

            if (costoCuidadosVeterinarios < 0) {
                System.out.println("El costo de cuidados veterinarios no puede ser negativo.");
                return;
            }

            Mamifero mamifero = new Mamifero(
                    tipoPelaje,
                    cantidadAlimentoDiario,
                    costoCuidadosVeterinarios,
                    id,
                    edad,
                    peso,
                    nombre,
                    especies,
                    zonaZoologico,
                    costoAlimentacion
            );

            animales.add(mamifero);
            System.out.println("Mamifero registrado correctamente.");

        } else if (tipoAnimal == 2) {

            System.out.print("Tamano de alas en cm, use coma si tiene decimales: ");
            double tamanoAlas = entrada.nextDouble();
            entrada.nextLine();

            System.out.print("Puede volar? Si o No: ");
            String puedeVolar = entrada.nextLine();

            if (tamanoAlas <= 0) {
                System.out.println("El tamano de las alas debe ser mayor que cero.");
                return;
            }

            if (puedeVolar.equals("")) {
                System.out.println("Debe indicar si el ave puede volar.");
                return;
            }

            if (!puedeVolar.equals("Si") && !puedeVolar.equals("si")
                    && !puedeVolar.equals("No") && !puedeVolar.equals("no")) {
                System.out.println("Debe digitar Si o No.");
                return;
            }

            Ave ave = new Ave(
                    tamanoAlas,
                    puedeVolar,
                    id,
                    edad,
                    peso,
                    nombre,
                    especies,
                    zonaZoologico,
                    costoAlimentacion
            );

            animales.add(ave);
            System.out.println("Ave registrada correctamente.");

        } else if (tipoAnimal == 3) {

            System.out.print("Tipo de habitat: ");
            String tipoHabitat = entrada.nextLine();

            System.out.print("Temperatura requerida, use coma si tiene decimales: ");
            double temperaturaRequerida = entrada.nextDouble();
            entrada.nextLine();

            if (tipoHabitat.equals("")) {
                System.out.println("El tipo de habitat no debe estar vacio.");
                return;
            }

            if (temperaturaRequerida <= 0) {
                System.out.println("La temperatura requerida debe ser mayor que cero.");
                return;
            }

            Reptil reptil = new Reptil(
                    tipoHabitat,
                    temperaturaRequerida,
                    id,
                    edad,
                    peso,
                    nombre,
                    especies,
                    zonaZoologico,
                    costoAlimentacion
            );

            animales.add(reptil);
            System.out.println("Reptil registrado correctamente.");

        } else if (tipoAnimal == 4) {

            System.out.print("Tipo de agua: ");
            String tipoAgua = entrada.nextLine();

            System.out.print("Tamano del acuario, use coma si tiene decimales: ");
            double tamanoAcuario = entrada.nextDouble();
            entrada.nextLine();

            if (tipoAgua.equals("")) {
                System.out.println("El tipo de agua no debe estar vacio.");
                return;
            }

            if (tamanoAcuario <= 0) {
                System.out.println("El tamano del acuario debe ser mayor que cero.");
                return;
            }

            Pez pez = new Pez(
                    tipoAgua,
                    tamanoAcuario,
                    id,
                    edad,
                    peso,
                    nombre,
                    especies,
                    zonaZoologico,
                    costoAlimentacion
            );

            animales.add(pez);
            System.out.println("Pez registrado correctamente.");
        }
    }

    public static void listarAnimales(ArrayList<Animal> animales) {

        if (animales.size() == 0) {
            System.out.println("No hay animales registrados.");
        } else {
            System.out.println("======================================");
            System.out.println("          LISTADO DE ANIMALES");
            System.out.println("======================================");

            for (int i = 0; i < animales.size(); i++) {

                Animal animalActual = animales.get(i);

                System.out.println("Animal numero: " + (i + 1));
                System.out.println("Identificador: " + animalActual.getId());
                System.out.println("Nombre: " + animalActual.getNombre());
                System.out.println("Tipo de animal: " + animalActual.getTipoAnimal());
                System.out.println("Especie: " + animalActual.getEspecies());
                System.out.println("Edad en anios: " + animalActual.getEdad());
                System.out.println("Peso en Kg: " + animalActual.getPeso());
                System.out.println("Zona: " + animalActual.getZonaZoologico());
                System.out.println("Costo de alimentacion mensual en dolares: " + animalActual.getCostoAlimentacion());
                System.out.println("Costo mensual de mantenimiento en dolares: " + animalActual.calcularCostoMantenimiento());
                System.out.println("--------------------------------------");
            }
        }
    }

    public static void verReporte(ArrayList<Animal> animales) {

        double totalMantenimiento = 0;
        int totalMamiferos = 0;
        int totalAves = 0;
        int totalReptiles = 0;
        int totalPeces = 0;

        if (animales.size() == 0) {
            System.out.println("No hay animales registrados para generar reporte.");
        } else {

            for (int i = 0; i < animales.size(); i++) {

                Animal animalActual = animales.get(i);

                totalMantenimiento = totalMantenimiento + animalActual.calcularCostoMantenimiento();

                if (animalActual.getTipoAnimal().equals("Mamifero")) {
                    totalMamiferos = totalMamiferos + 1;
                } else if (animalActual.getTipoAnimal().equals("Ave")) {
                    totalAves = totalAves + 1;
                } else if (animalActual.getTipoAnimal().equals("Reptil")) {
                    totalReptiles = totalReptiles + 1;
                } else if (animalActual.getTipoAnimal().equals("Pez")) {
                    totalPeces = totalPeces + 1;
                }
            }

            System.out.println("======================================");
            System.out.println("          REPORTE DEL ZOOLOGICO");
            System.out.println("======================================");
            System.out.println("Total de animales registrados: " + animales.size());
            System.out.println("Total de mamiferos: " + totalMamiferos);
            System.out.println("Total de aves: " + totalAves);
            System.out.println("Total de reptiles: " + totalReptiles);
            System.out.println("Total de peces: " + totalPeces);
            System.out.println("Costo total mensual de mantenimiento en dolares: " + totalMantenimiento);
            System.out.println("======================================");
        }
    }
}
