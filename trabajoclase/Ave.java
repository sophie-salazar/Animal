
package com.mycompany.trabajoclase;

class Ave extends Animal {
    private double envergaduraAlas;

    public Ave(String nombre, int edad, double envergaduraAlas) {
        super(nombre, edad);
        this.envergaduraAlas = envergaduraAlas;
    }

    public void volar() {
        System.out.println(nombre + " esta volando.");
    }
}
