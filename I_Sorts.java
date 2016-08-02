 
/**
 * @author carlos
 *
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
