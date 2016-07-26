/**
Universidad del Valle de Guatemala
Algoritmos y Estructura de datos
Hoja de Trabajo 2
Clase: Calculadora, clase que implementa metodos donde se lee archivo y hace calculos 
 * @author Paulina Cano 15053
 * @author Jackeline Hidalgo 15776
 **/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora implements iCalculadora{
	
	Pila<Integer> MiPila= new Pila<>();
	int resultado= 0;
	String string= " ";

	@Override
	public int Calcular(String vector) {
		char[] cadena = vector.toCharArray();
		for (char pos: cadena)
		{
			//Si es un numero hace un push a la pila de este
			int numero= Character.getNumericValue(pos);
			if(numero>=0)
			{
				MiPila.push(numero);
			}
			else
				//Si es caracter valua para ver que operacion realizar
			{
				if(pos == '+')
				{
					resultado = MiPila.pop()+MiPila.pop();
				}
				if(pos == '-')
				{
					resultado = -MiPila.pop()+MiPila.pop();
				}
				if(pos == '*')
				{
					resultado = MiPila.pop()*MiPila.pop();
				}
				if(pos == '/')
				{
					resultado = MiPila.pop()/MiPila.pop();
				}
			}
		}
		return resultado;
	}

	//metodo para leer el archivo
	@Override
	public String LeerArchivo(String direccion) { //recibe nombre del archivo
        File archivo = null;
        String linea = "";
        FileReader lector = null; 
        BufferedReader breader = null;

        try {
            archivo = new File(direccion); //asigna el nombre del archico a la variable archivo
            lector = new FileReader(archivo);
            breader= new BufferedReader(lector);

            linea = breader.readLine(); //lee linea
        
        }
        catch(IOException ex) {
            System.out.println("No se lee el archivo"); //imprime mensaje si no lee el archivo                  
        
        }
		return linea;
       
    }

}
