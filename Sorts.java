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
	public T[] MergeSort(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
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
