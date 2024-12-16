
package com.mycompany.trabajoclase;

import java.util.Scanner;

public class TrabajoClase {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el nombre y la edad del animal
        System.out.println("Ingrese el nombre del animal:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del animal:");
        int edad = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de linea pendiente

        // Seleccion del tipo de animal
        System.out.println("Seleccione el tipo de animal:");
        System.out.println("1. Mamifero");
        System.out.println("2. Ave");
        System.out.println("3. Reptil");
        int opcionAnimal = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de linea pendiente

        Animal animal = null;

        // Crear el objeto animal segun la seleccion del usuario
        if (opcionAnimal == 1) {
            System.out.println("Ingrese el tipo de pelaje del mamifero:");
            String tipoPelaje = scanner.nextLine();
            animal = new Mamifero(nombre, edad, tipoPelaje);
        } else if (opcionAnimal == 2) {
            System.out.println("Ingrese la envergadura de las alas del ave:");
            double envergaduraAlas = scanner.nextDouble();
            scanner.nextLine();  // Consumir el salto de linea pendiente
            animal = new Ave(nombre, edad, envergaduraAlas);
        } else if (opcionAnimal == 3) {
            System.out.println("Ingrese el tipo de escamas del reptil:");
            String tipoEscamas = scanner.nextLine();
            animal = new Reptil(nombre, edad, tipoEscamas);
        }

        // Seleccion de la accion que el animal puede hacer
        System.out.println("Seleccione la accion que desea que haga el animal:");
        System.out.println("1. Comer");
        System.out.println("2. Dormir");

        int opcionAccion = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de linea pendiente

        // Ejecutar la accion elegida
        if (opcionAccion == 1) {
            animal.comer();
        } else if (opcionAccion == 2) {
            animal.dormir();
        }

        // Acciones especificas para cada subclase
        if (animal instanceof Mamifero) {
            Mamifero mamifero = (Mamifero) animal;
            System.out.println("Desea que el mamifero amamante? (si/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                mamifero.amamantar();  // Se muestra la accion de amamantar
            }
        } else if (animal instanceof Ave) {
            Ave ave = (Ave) animal;
            System.out.println("Desea que el ave vuele? (si/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                ave.volar();  // Se muestra la accion de volar
            }
        } else if (animal instanceof Reptil) {
            Reptil reptil = (Reptil) animal;
            System.out.println("Desea que el reptil se arrastre? (si/no)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("si")) {
                reptil.arrastrarse();  // Se muestra la accion de arrastrarse
            }
        }

        scanner.close();
    }
}
 
