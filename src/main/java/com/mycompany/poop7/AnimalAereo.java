/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author Daniel Medrano,Angel Jimenez,Ariana Alvarez,Melisa Matias
 * 
 */
public class AnimalAereo extends Animal{
    private int numeroAlas;
    /**
     * Creamos un constructor vacio de la Clase Animal Aereo
     */
    public AnimalAereo() {
    }
    /**
     * Creamos un constructor con los atributos de la Clase Animal Aereo y los datos
     * EXTEND de la clase Animal 
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAlas 
     */
    public AnimalAereo(String nombre, String lugarOrigen, String color, int numeroAlas) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }
    /**
     * Regresamos el numero de Alas que tiene el ave
     * @return Numero de Alas
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }
    /**
     * Recibimos el Numero de Alas que tiene nuestro animal
     * @param numeroAlas 
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }
    /**
     * Imprimimos que el animal puede volar
     */
    public void volar(){
        System.out.println("Este animal tiene la capacidad de volar");
    }
    
    /**
     *Hacemos una referencia a la Clase Animal gracias al Extend
     * Imprimimos que come semillas
     */
    @Override
    public void comer(){
        super.comer();
        System.out.println("Este animal esta comiendo semillas");
    }
    /**
     * Hacemos una referencia a la Clase Animal gracias al Extend
     * @return Los atributos guardados del Objeto Creado
     *  
     */
    @Override
    public String toString() {
        return super.toString()+
                "AnimalAereo{" + "numeroAlas=" + numeroAlas + " alas }";
    }
}
