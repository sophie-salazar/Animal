
package com.mycompany.trabajoclase;


class Mamifero extends Animal {
    private String tipoPelaje;

    public Mamifero(String nombre, int edad, String tipoPelaje) {
        super(nombre, edad);
        this.tipoPelaje = tipoPelaje;
    }

    public void amamantar() {
        System.out.println(nombre + " esta amamantando a sus crias.");
    }
}
