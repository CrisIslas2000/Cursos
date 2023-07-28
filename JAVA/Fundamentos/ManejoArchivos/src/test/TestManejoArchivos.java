package test;

/**
 * @author INFORMATICA CRIS
 */
import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //crearArchivo(nombreArchivo);

//        anexarArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "Adios desde Java");
        leerArchivo(nombreArchivo);
    }
}
