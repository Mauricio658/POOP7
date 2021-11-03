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
public class Main {
    public static void main(String[] args) {
        Empleado empl= new Empleado();
        empl.setNombre("Mauricio");
        empl.setApellido("Jimenez");
        empl.setNumEmpleado(318035327);
        empl.setSueldo(25_000);
        System.out.println(empl);
        
        Gerente gere= new Gerente();
        gere.setNombre("Pablo");
        gere.setApellido("Hernandez");
        gere.asignarPresupuesto(50_000);
        System.out.println(gere);
        
        Gerente ger2=new Gerente(120000,"Karen","Avalor",318035,80_000 );
        System.out.println(ger2);
        
        Gerente ger3=new Gerente("Samanta","Rios",989521,35_000);
        System.out.println(ger3);
        
        System.out.println("--------------------------------Instancias---------");
        if(ger3 instanceof Gerente){
            System.out.println("Gerente es una instancia de Gerente");
        }
        
        if(ger3 instanceof Empleado){
            System.out.println("Gerente es una instancia de Empleado");  
        }
        
        if(gere instanceof Object){
            System.out.println("Gerente es una instancia de Object");
        }
        System.out.println("\n\n########### ANIMALES ###########");
        
        Ballena ballena1 = new Ballena("Willy", "Oceano Pacifico", "Blanco y Negro", 2, 5);
        System.out.println(ballena1);
        ballena1.sonido("Canto");
        ballena1.comer();
        ballena1.nadar();
        ballena1.pelearConPinocho();
        System.out.println("\n");
        
        Perro perro1 = new Perro("Milaneso", "Perro de Casa", "Gris Aperlado", 4, "Rojo");
        System.out.println(perro1);
        perro1.sonido("Ladrido");
        perro1.comer();
        perro1.correr();
        perro1.hacerTrucos();
        System.out.println("\n");
        
        Pajaro pajaro1 = new Pajaro("Piolin", "Bosque", "Cafe Claro", 2, "Generalista");
        System.out.println(pajaro1);
        pajaro1.sonido("Silbido");
        pajaro1.comer();
        pajaro1.volar();
        pajaro1.recolectarRamas();
    }
}
