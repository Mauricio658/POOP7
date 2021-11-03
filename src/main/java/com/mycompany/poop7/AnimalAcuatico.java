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
public class AnimalAcuatico extends Animal{
    private int numeroAletas;
    /**
     * Creamos un constructor vacio de la Clase Animal Acuatico
     */
    public AnimalAcuatico() {
    }
    /**
     * Creamos un constructor con los atributos de la Clase Animal Acuatico 
     * @param numeroAletas 
     */
    public AnimalAcuatico(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Creamos un constructor con los atributos de la Clase Animal Acuatico y los datos
     * EXTEND de la clase Animal 
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAletas 
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color, int numeroAletas) {
        super(nombre, lugarOrigen, color);
        this.numeroAletas = numeroAletas;
    }
    /**
     * Regresamos el numero de Aletas que tiene la clase animal acuatico
     * @return 
     */
    public int getNumeroAletas() {
        return numeroAletas;
    }
    /**
     * Recibimos el Numero de Aletas que tiene el animal
     * @param numeroAletas 
     */
    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    /**
     * Imprimimos que el animal puede nadar
     */
    public void nadar(){
        System.out.println("Este animal tiene la capacidad de nadar");
    }
    /**
     *Hacemos una referencia a la Clase Animal gracias al Extend
     * Imprimimos que come comida marina
     */
    @Override
    public void comer(){
        super.comer();
        System.out.println("Esta animal esta comiendo comida marina");
    }
    /**
     * Hacemos una referencia a la Clase Animal gracias al Extend
     * @return Los atributos guardados del Objeto Creado
     *  
     */
    @Override
    public String toString() {
        return super.toString()+
                "AnimalAcuatico{" + "numeroAletas=" + numeroAletas +" aletas}";
    }
    
}
