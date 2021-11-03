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
public class Gerente extends Empleado {
    private int presupuesto;
    private boolean presupuestoAsignado;
    /**
     * Creamos un constructor vacio de la Clase Gerente
     */
    public Gerente() {
    }
    /**
     * Declaramos el constructor con los atributos de la Clase Gerente
     * Recibir los datos Nombre,Apellido,NumEmpleado,Sueldo los recibimos con ayuda de la superclase Empleado
     * @param presupuesto
     * @param Nombre
     * @param Apellido
     * @param numEmpleado
     * @param sueldo 
     */
    public Gerente(int presupuesto, String Nombre, String Apellido,int numEmpleado, int sueldo) {
        super(Nombre, Apellido, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
        presupuestoAsignado=true;
    }
    /**
     * Declaramos otro constructor 
     * @param Nombre
     * @param Apellido
     * @param numEmpleado
     * @param sueldo 
     */
    public Gerente(String Nombre, String Apellido,int numEmpleado, int sueldo) {
        super(Nombre, Apellido, numEmpleado, sueldo);
    }
    
    /**
     * Regresamos el Presupuesto
     * @return Presupuesto
     */
    public int getPresupuesto() {
        return presupuesto;
    }
    /**
     * Recibimos el Presupuesto que podemos aplicar
     * @param presupuesto 
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    /**
     * Si PresupuestoAsignado es True,entonces guardamos el valor 
     * del Presupuesto
     * @param presupuesto 
     */
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
        presupuestoAsignado=true;
    }
    /**
     * Hacemos una referencia a la Clase Empleado gracias al Extend
     * @return Los atributos guardados del Objeto Creado
     */
    @Override
    public String toString() {
        return super.toString()+
                "Gerente{" + "presupuesto=" + presupuesto + ", presupuestoAsignado=" + presupuestoAsignado + '}';
    }
}
