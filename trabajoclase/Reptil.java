
package com.mycompany.trabajoclase;

class Reptil extends Animal {
    private String tipoEscamas;

    public Reptil(String nombre, int edad, String tipoEscamas) {
        super(nombre, edad);
        this.tipoEscamas = tipoEscamas;
    }

    public void arrastrarse() {
        System.out.println(nombre + " se esta arrastrando.");
    }
}

