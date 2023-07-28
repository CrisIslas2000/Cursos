package test;
/**
 * @author INFORMATICA CRIS
 */

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Cristian", 50000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());
        
        //Downcasting
        ((Escritor) empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //uppcasting
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
        
        
    }
}
