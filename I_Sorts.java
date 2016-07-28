 
/**
*I_CSorts, Esta interfaz define los metodos de ordenamiento
*@version: 2.0
*@author: 
*@since 2016-07-28
*/
public interface I_Sorts<T> {
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public T[] SelectionSort(T array[]);
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public T[] InsertionSort(T array[]);
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public T[] MergeSort(T array[]);
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public T[] QuickSort(T array[]);
	
}
