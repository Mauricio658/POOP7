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
public class Perro extends AnimalTerrestre{
    private String colorCollar;
    /**
     * Creamos un Constructor Vacio de la Clase Perro
     */
    public Perro() {
    }
    /**
     * Creamos otro Constructor con los atributos de la Clase Perro y los datos
     * EXTEND de la clase Animal Terrestre
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroPatas
     * @param colorCollar 
     */
    public Perro(String nombre, String lugarOrigen, String color, int numeroPatas, String colorCollar) {
        super(nombre, lugarOrigen, color, numeroPatas);
        this.colorCollar = colorCollar;
    }
    /**
     * Regresamos el color del collar
     * @return Color del Collar
     */
    public String getColorCollar() {
        return colorCollar;
    }
    /**
     * Recibimos el Color del Collar
     * @param colorCollar 
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    /**
     * Imprimimos que el Objeto Perro sabe hacer trucos
     */
    public void hacerTrucos(){
        System.out.println("El perro sabe hacer trucos que le enseñó su humano");
    }
    /**
     * Hacemos una referencia a la Clase Animal Terrestre gracias al Extend
     * @return Los atributos guardados del Objeto Creado
     * 
     */
    @Override
    public String toString() {
        return super.toString()+
                "Perro{" + "colorCollar=" + colorCollar + '}';
    }
}
