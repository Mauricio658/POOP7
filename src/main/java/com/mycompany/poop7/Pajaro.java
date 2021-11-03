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
public class Pajaro extends AnimalAereo {
    private String tipoPico;
    /**
     * Creamos un constructor vacio de la Clase Pajaro
     */
    public Pajaro() {
    }
    /**
     * Creamos un constructor con los atributos de la Clase Pajaro y los datos
     * EXTEND de la clase Animal Aereo
     * @param nombre
     * @param lugarOrigen
     * @param color
     * @param numeroAlas
     * @param tipoPico 
     */
    public Pajaro(String nombre, String lugarOrigen, String color, int numeroAlas, String tipoPico) {
        super(nombre, lugarOrigen, color, numeroAlas);
        this.tipoPico = tipoPico;
    }
    /**
     * Regresamos el valor recibido del Tipo de Pico
     * @return Tipo de Pico
     */
    public String getTipoPico() {
        return tipoPico;
    }
    /**
     * Recibimos el tipo de pico que tiene el Pajaro
     * @param tipoPico 
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    /**
     * Imprimimos que el Objeto Pajaro recolecta ramas
     */
    public void recolectarRamas(){
        System.out.println("El pajaro esta recolectando ramas");
    }
    /**
     * Hacemos una referencia a la Clase Animal Aereo gracias al Extend
     * @return Los atributos guardados del Objeto Creado 
     */
    @Override
    public String toString() {
        return super.toString()+
                "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
}
