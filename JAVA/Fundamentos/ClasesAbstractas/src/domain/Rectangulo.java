/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author INFORMATICA CRIS
 */
public class Rectangulo extends FiguraGeometrica{

    public Rectangulo (String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }
}
