/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de datos
Hoja de Trabajo 2
Clase: Main, clase principal que imprime resultado 
 * @author Paulina Cano 15053
 * @author Jackeline Hidalgo 15776
 * @author Irvin Oliva 15816
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora miCalculadora = new Calculadora();
        System.out.println("El resultado es: "+Calculadora.Calcular(Calculadora.LeerArchivo("prueba.txt")));
    }
    
}
