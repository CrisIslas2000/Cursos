package test;

import aritmetica.*;
import excepciones.OperacionExcepcion;

/**
 * @author INFORMATICA CRIS
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = Aritmetica.division(10,0);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Ocurrio un error de tipo Exception");
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
            //
        }
        finally{
            System.out.println("Se reviso la division entre crero");
        }
        System.out.println("resultado = " + resultado);
    }
}
