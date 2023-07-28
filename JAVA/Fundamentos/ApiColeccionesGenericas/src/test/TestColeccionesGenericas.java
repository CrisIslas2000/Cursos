package test;

import java.util.*;

/**
 * @author INFORMATICA CRIS
 */
public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
//        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);
//        System.out.println("Con List");
        //imprimir(miLista);
//        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes"); 
        miSet.add("Viernes"); 
//        System.out.println("Con Set");
//        imprimir(miSet);
        
        Map<String, String> miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Carla");
        miMapa.put("valor3", "Rosario");
        
//        String elemento = (String) miMapa.get("valor1");
//        System.out.println("elemento = " +elemento);
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }
    public static void imprimir(Collection<String> coleccion){
        System.out.println("Con for normal");
        for(String elemento : coleccion){
            System.out.println("elemento = " + elemento);
        }
        
        System.out.println("Con forEach");
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
