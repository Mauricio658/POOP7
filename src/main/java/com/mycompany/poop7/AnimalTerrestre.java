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
public class AnimalTerrestre extends Animal{
    private int numeroPatas;
    /**
     * Creamos un contructor vacio de la clase Animal Terrestre
     */
    public AnimalTerrestre() {
    }
    /**
     * Creamos un constructor con los atributos de la Clase Animal Terrestre y los datos
     * EXTEND de la clase Animal 
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroPatas 
     */
    public AnimalTerrestre(String nombre, String lugarOrigen, String color, int numeroPatas) {
        super(nombre, lugarOrigen, color);
        this.numeroPatas = numeroPatas;
    }
    /**
     * Regresamos el numero de Patas 
     * @return Numero de Patas
     */
    public int getNumeroPatas() {
        return numeroPatas;
    }
    /**
     * Recbimos el numero de patas que tiene el animal
     * @param numeroPatas 
     */
    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
    /**
     * Imprimimos si el animal tiene la capacidad de correr
     */
    public void correr(){
        System.out.println("Este animal tiene la capacidad de correr");
    }
    
    @Override
    public void comer(){
        super.comer();
        System.out.println("El animal esta comiendo carne");
    }
    /**
     * Hacemos una referencia a la Clase Animal gracias al Extend
     * @return Los atributos guardados del Objeto Creado
     *  
     */
    @Override
    public String toString() {
        return super.toString()+
                "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + " patas }";
    }   
}
