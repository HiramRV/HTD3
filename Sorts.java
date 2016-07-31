/**
 * @author carlos
 * @param <T>
 *
 */
public class Sorts<T> implements I_Sorts<T> {

	
	private T datos[];
	/**
	 * 
	 */
	public Sorts() {
		
	}

	@Override
	public T[] SelectionSort(T[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] InsertionSort(T[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] MergeSort(T[] array) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T[] QuickSort(T[] array) {
		datos = array;
		recursive(0, array.length - 1);
		return datos;
	}
	
	/**
	 * Método recursivo para ordenar arreglo
	 * @param low
	 * @param high
	 */
	private void recursive(int low, int high) {
		int i = low;
		int j = high;
		int pivot = (int) datos[low + (high - low)/2];
		while (i <= j) {
			while ((int)datos[i] < pivot) {
				i++;
			}
			
			while ((int)datos[j] > pivot) {
				j--;
			}
			
			if (i <= j){
				swap(i,j);
				i++;
				j--;
			}
		}
		if (low < j) {
			recursive(low, j);
		}
		if (i < high) {
			recursive(i, high);
		}
	}
	
	/**
	 * Intercambia de posición dos valores
	 * @param i
	 * @param j
	 */
	private void swap(int i, int j) {
		T temp = datos[i];
		datos[i] = datos[j];
		datos[j] = temp;
	}

	/**
	 * @return datos
	 */
	public T[] GetDatos() {
		return datos;
	}

	/**
	 * @param datos arreglo a ordenar
	 */
	public void SetDatos(T datos[]) {
		this.datos = datos;
	}
}
