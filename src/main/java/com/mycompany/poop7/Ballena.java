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
public class Ballena extends AnimalAcuatico{
    private int largo;
    /**
     * Creamos un constructor vacio de la Clase Ballena
     */
    public Ballena() {
    }
    /**
     * Creamos un constructor con los atributos de la clase Ballena y los datos
     * EXTEND de la clase Animal Acuatico
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAletas
     * @param largo 
     */
    public Ballena(String nombre, String lugarOrigen, String color, int numeroAletas, int largo) {
        super(nombre, lugarOrigen, color, numeroAletas);
        this.largo = largo;
    }
    /**
     * Regresamos el valor del largo de la ballena
     * @return  Largo
     */
    public int getLargo() {
        return largo;
    }
    /**
     * Recibimos el valor del largo de la ballena
     * @param largo 
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    /**
     * Imprimimos que la ballena pelea con Pinocho
     */
    public void pelearConPinocho(){
        System.out.println("La Ballena está peleando con Pinocho");
    }
    /**
     * Hacemos una referencia a la Clase Animal Acuatico gracias al Extend
     * @return Los atributos guardados del Objeto Creado 
     */
    @Override
    public String toString() {
        return super.toString()+
                "Ballena{" + "largo=" + largo +" metros }";
    }
}
