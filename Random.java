import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Random;


import static java.lang.System.*;

/**
 * @author carlos
 * @param <T>
 *
 */
public class Random<T> {

	private int cantRandom;
	private Class<T> rand;
	
	/**
	 * 
	 */
	public int Random1(int cantRandom) {
		Random random = new Random();
		int arrayLenght = random.nextInt(3000) + 10;
		System.out.println("Cantidad de valores creados = " +arrayLenght);
		for (int i = 1; i<= arrayLenght; i++){
			cantRandom = random.nextInt(50000) +1;
			System.out.println("Se ha creado un valor" + cantRandom);
		}
		return cantRandom;
	}


	/**
	 * @return the cantRandom
	 */
	public int getCantRandom() {
		return cantRandom;
	}


	/**
	 * @param cantRandom the cantRandom to set
	 */
	public void setCantRandom(int cantRandom) {
		this.cantRandom = cantRandom;
	}

	/**
	 * 
	 * @param ruta
	 */
	public void CrearArchivo(String Ruta) {
		Ruta = "Random.txt"
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("Random.txt"),"utf-8")))
		{
			writer.write(cantRandom);
		}
		catch (IOException ex){
			System.out.println("No se pudo crear el archivo '") 
	                + Ruta + "'");                  
	        
	        }
	 }	

	
	/**
	 * 
	 * @param ruta
	 * @return
	 */
	public T[] LeerArchivo(String RutaArchivo) {
		String str = "";
		T[] array = (T[]) new Integer[cantRandom];
		try {
			FileReader f = new FileReader(RutaArchivo);
			BufferedReader b = new BufferedReader(f);
			try {
				int j = 0;
				while ((str = b.readLine()) != null) {
					try {
						Integer i = Integer.parseInt(str);
						array[j] = (T) i;
						j++;
					} catch (Exception e) {
						b.close();
						return null;
					}
					
				}
				b.close();
				return array;
			} catch (IOException e) {
				return null;
			}
		} catch (FileNotFoundException e) {
			return null;
		}
	}
}
