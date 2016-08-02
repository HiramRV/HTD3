 
/**
*I_Sorts, Esta interfaz define los metodos de ordenamiento
*@version: 2.0
*@author: Luis Sierra, 131074 // Carlos Solorzano, 08832 // Steven Rubio, 15044 // Diego Lopez, 141222
*@since 2016-08-1
*/

public interface I_Sorts<T> {
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public Object[] SelectionSort(T array[], int n);
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public T[] InsertionSort(T array[], int n);
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public T[] MergeSort(T array[], T array2[], int a, int b, int c);
	
	//pre: Recibe una lista ordenada o no ordenada 
	//post: Retorna una lista ordenada
	public T[] QuickSort(T array[]);
	
}

