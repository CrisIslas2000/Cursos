package test;

import domain.Empleado;
import domain.Gerente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author INFORMATICA CRIS
 */
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado = new Empleado ("Juan", 4000);
        determinarTipo(empleado);
        empleado =new Gerente("Cristian", 5000, "Sistemas");
        //determinarTipo(empleado);
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " +gerente.getDepartamento());
            ((Gerente) empleado).getDepartamento();
        }else if(empleado instanceof Empleado){
            System.out.println("Es de tipo empleado");
//          Gerente gerente = (Gerente) empleado;
//          System.out.println("gerente = " + gerente.getDepartamento());
            System.out.println("empleado = "+empleado.getNombre());
        } else if(empleado instanceof Object){
            System.out.println("Es de tipo object");
            empleado.toString();
            
        }
    }
}
