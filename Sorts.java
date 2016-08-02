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
		 for (int i = 0; i < array.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < array.length; j++)
	                if ((int)array[j] < (int)array[index])
	                    index = j;

	            int smallerNumber = (int)array[index]; 
	            array[index] = array[i];
	            array[i]  = (T) new Integer(smallerNumber);
	        }
	        return array;
	}

	@Override
	public T[] InsertionSort(T[] array) {
		datos = array;
		int key;
		int i;
		for (int j = 0; j < array.length; j++) {
			key = (int) array[j];
			for (i = j; (i >= 0) && ((int)array[i] < j); i++) {
				array[i+1] = array[i];
			}
			array[i+1] = (T) new Integer(key);
		}
		return array;
	}

	@Override
	public T[] MergeSort(T[] array) {
        mergesort(0, array.length-1);
		return datos;
	}

	/**
	 * 
	 * @param low
	 * @param high
	 */
	private void mergesort(int low, int high) {
	    if (low < high) {
	      int middle = low + (high - low) / 2;
	      mergesort(low, middle);
	      mergesort(middle + 1, high);
	      merge(low, middle, high);
	    }
	  }

	/**
	 * 
	 * @param low
	 * @param middle
	 * @param high
	 */
	  private void merge(int low, int middle, int high) {
		  T[] helper = datos;
	    for (int i = low; i <= high; i++) {
	      helper[i] = datos[i];
	    }

	    int i = low;
	    int j = middle + 1;
	    int k = low;
	    while (i <= middle && j <= high) {
	      if ((int)helper[i] <= (int)helper[j]) {
	        datos[k] = helper[i];
	        i++;
	      } else {
	        datos[k] = helper[j];
	        j++;
	      }
	      k++;
	    }
	    while (i <= middle) {
	      datos[k] = helper[i];
	      k++;
	      i++;
	    }
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
