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
			int numero= Character.getNumericValue(pos);
			if(numero>=0)
			{
				MiPila.push(numero);
			}
			else
			{
				if(pos == '+')
				{
					resultado = MiPila.pop()+MiPila.pop();
				}
				if(pos == '-')
				{
					resultado = MiPila.pop()-MiPila.pop();
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

	
	@Override
	public String LeerArchivo(String direccion) {
        File archivo = null;
        String linea = "";
        FileReader lector = null; 
        BufferedReader breader = null;

        try {
            archivo = new File(direccion);
            lector = new FileReader(archivo);
            breader= new BufferedReader(lector);

            linea = breader.readLine();
        
        }
        catch(IOException ex) {
            System.out.println("No se lee el archivo");                  
        
        }
		return linea;
       
    }

}