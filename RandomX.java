/**
*Random, Esta clase genera el archivo con los numeros random 
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
import java.util.Random;


public class RandomX<T> {

	private int cantRandom;

	
	/**
	 * 
	 * Constructor 
	 */
	public RandomX(int n){
		this.cantRandom = n;
	}
	
	/**
	 * 
	 * @return arreglo de números pseudoaleatorios
	 */
	private int[] generateRandom() {
		int[] array = new int[cantRandom];
		for (int i = 0; i != array.length; i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		return array;
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
		int[] array = generateRandom();
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(Ruta),"utf-8")))
		{
			for (int i = 0; i != array.length; i++) {
				writer.write(new Integer(array[i]).toString() + "\n");
			}
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
