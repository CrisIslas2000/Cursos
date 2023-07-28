/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author INFORMATICA CRIS
 */
public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        
        ClaseGenerica<String> objectoString = new ClaseGenerica("Juan");
        objectoString.obtenerTipo();
    }
}
