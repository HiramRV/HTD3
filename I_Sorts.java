 
/**
*I_Sorts, Esta interfaz define los metodos de ordenamiento
*@version: 2.0
*@author: Luis Sierra, 131074 // Carlos Solorzano, 08832 // Steven Rubio, 15044 // Diego Lopez, 141222
*@since 2016-01-08
*/
public interface I_Sorts<T> {
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public T[] SelectionSort(T array[]);
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public T[] InsertionSort(T array[]);
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public T[] MergeSort(T array[]);
	
	/**
	 * 
	 * @param array
	 * @return
	 */
	public T[] QuickSort(T array[]);
	
}
