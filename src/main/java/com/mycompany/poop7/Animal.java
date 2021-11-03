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
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;
    /**
     * Creamos un constructor vacio de la Clase Animal
     */
    public Animal() {
    }
    /**
     * Constructor con los atributos de la Clase Animal
     * @param nombre
     * @param lugarOrigen
     * @param color 
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }
    /**
     * Regresamos el nombre del animal
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Recibimos el nombre del animal
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Regresamos el lugar de Origen del Animal
     * @return Lugar de Origen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }
    /**
     * Recibimos el lugar de Origen del Animal
     * @param lugarOrigen 
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }
    /**
     * Regresamos el color del collar
     * @return Color
     */
    public String getColor() {
        return color;
    }
    /**
     * Recibimos el color del collar
     * @param color 
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Recibimos el sonido que hace el animal
     * Imprimimos ese dato recibido
     * @param sonido 
     */
    public void sonido(String sonido){
        System.out.println("El sonido de este animal es: "+sonido);
    }
    /**
     * Imprimimos que el animal tiene la capacidad de comer
     */
    public void comer(){
        System.out.println("El animal tiene la capacidad de comer por sí solo");
    }
    /**
     * Regresamos los atributos guardados de la Clase animal
     * @return 
     */
    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
}
