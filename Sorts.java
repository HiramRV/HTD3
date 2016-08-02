/**
*Sorts, Esta clase define los metodos sort a utilizar 
*@version: 6.0
*@author: Luis Sierra, 131074 // Carlos Solorzano, 08832 // Steven Rubio, 15044 // Diego Lopez, 141222
*@since 2016-07-31
*/
public class Sorts<T> implements I_Sorts<T> {

	
	private T datos[];
	/**
	 * 
	 */
	public Sorts() {
		
	}

	@Override
	//Ayuda de Java Structures, Duane A.Bailey
	public T[] SelectionSort(T[] array, int n) {
		datos = array;
		int nOrdenados = n;
		int index;
		int max;
		
		while(nOrdenados > 0 ){
			max = 0;
			for(index = 1; index < nOrdenados; index ++)
			{
				if ((int)datos[max] < (int)datos[index]) 
				{
				max = index;
				}
				
			}
			swap1 (datos, max, nOrdenados - 1);
		}
		return datos;
	}
		

	@Override
		public T[] InsertionSort(T[] array, int n) {
			// TODO Auto-generated method stub
			datos = array;
			int numerosOrd = 1;
			int index;
			while(numerosOrd < n){
				int temp = (int) datos[numerosOrd];
				for (index = numerosOrd; index > 0; index--){
					if (temp < (int)datos[index - 1]){
						datos [index]=datos[index-n];
					}else {
						break;
					}
				}
				int x = (int)datos[index];
				x =temp;
				numerosOrd++;
			}
			
			return null;
		}

	@Override
	public T[] MergeSort(T[] a, T[] tmp, int left, int right, int rightEnd) {
			  int leftEnd = right - 1;
		        int k = left;
		        int num = rightEnd - left + 1;

		        while(left <= leftEnd && right <= rightEnd)
		            if((int)a[left] <=(int)a[right])
		                tmp[k++] = a[left++];
		            else
		                tmp[k++] = a[right++];

		        while(left <= leftEnd)    // Copy rest of first half
		            tmp[k++] = a[left++];

		        while(right <= rightEnd)  // Copy rest of right half
		            tmp[k++] = a[right++];

		        // Copy tmp back
		        for(int i = 0; i < num; i++, rightEnd--){
		            a[rightEnd] = tmp[rightEnd];
		        }
		            
		        return a;
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
	
	private void swap1(datos, int i, int j) {
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
