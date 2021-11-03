/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop7;

/**
 *
 * @author Daniel Medrano,Angel Jimenez,Ariana Alvarez,Melisa Matias
 * 
 */
public class Empleado extends Object {
    private String Nombre;
    private String Apellido;
    private int numEmpleado;
    private int sueldo;
    /**
     * Creamos un constructor vacio de la Clase Empleado
     */
    public Empleado() {
    }
    /**
     * Declaramos el constructor con los atributos de la Clase Empleado
     * @param Nombre
     * @param Apellido
     * @param numEmpleado
     * @param sueldo 
     */
    public Empleado(String Nombre, String Apellido, 
                    int numEmpleado, int sueldo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    /**
     * Regresamos el Nombre del Empleado
     * @return 
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * Recibimos el Nombre del Empleado
     * @param Nombre 
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * Regresamos el Apellido del Empleado
     * @return 
     */
    public String getApellido() {
        return Apellido;
    }
    /**
     * Recibimos el Apellido del Empleado
     * @param Apellido 
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /**
     * 
     * @return Rgeresamos el Numero de Empleado sin alteracion
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }
    /**
     * Numero de Empleado que tienen nuestro objeto
     * @param numEmpleado 
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }
    /**
     * Valor de sueldo sin el aumento
     * @return Rgeresamos el valor de sueldo original
     */
    public int getSueldo() {
        return sueldo;
    }
    /**
     * Recibimos el Sueldo,si es menor que cero
     * entonces no esta siendo pagado
     * @param sueldo 
     */
    public void setSueldo(int sueldo) {
        if(sueldo > 0){
            this.sueldo = sueldo;
        }else{
            this.sueldo = 0;
        }
    }
    /**
     * Sumamos el sueldo con el porcentaje por el sueldo
     * actual y dividimos entre 100
     * @param porcentaje Recibimos el procentaje a aumentar
     * @return Rgeresamos el sueldo actualizado  
     */
    public int aumentarSueldo(int porcentaje){
        sueldo +=(sueldo*porcentaje)/100;
        return sueldo;
    }
    /**
     * Los atributos de la Clase Empleado
     * @return 
     */
    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    } 
}
