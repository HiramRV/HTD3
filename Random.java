import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

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
	public Random(int cantRandom) {
		this.cantRandom = cantRandom;
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
