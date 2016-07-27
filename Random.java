/**
 * @author carlos
 * @param <T>
 *
 */
public class Random<T> {

	private int cantRandom;
	
	
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
		return null;
	}
}
