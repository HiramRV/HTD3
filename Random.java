/**
*Random, Esta calse genera el archivo con los numeros random 
*@version: 3.0
*@author: Luis Sierra, 131074 // Carlos Solorzano, 08832 // Steven Rubio, 15044 // Diego Lopez, 141222
*@since 2016-08-01
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.Random;
import static java.lang.System.*;


public class RandomX<T> {

	private int cantRandom;
	private Class<T> rand;
	
	/**
	 * 
	 * Constructor 
	 */
	public RandomX(int n){
		this.cantRandom = n;
	
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
			System.out.println("No se pudo crear el archivo '" 
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
