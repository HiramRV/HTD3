/**
*I_Sorts, Esta interfaz define los metodos de ordenamiento
*@version: 2.0
*@author: Luis Sierra, 131074 // Carlos Solorzano, 08832 // Steven Rubio, 15044 // Diego Lopez, 141222
*@since 2016-08-1
*/

import static java.lang.System.*;
import java.util.Scanner;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		int options = 0;
		Scanner sc = new Scanner(System.in);
		RandomX<Integer> random = new RandomX<Integer>(10);
		Sorts<Integer> sorts = new Sorts<Integer>();
		while (options != 6) {
			out.println("1. Crear archivo");
			out.println("2. Selection sort");
			out.println("3. Insertion sort");
			out.println("4. Merge sort");
			out.println("5. Quick sort");
			out.println("6. Salir");
			try {
				options = sc.nextInt();
				switch (options) {
				case 1:
					int cant = 0;
					while (cant < 10 || cant > 3000) {
						try {
							out.println("Ingrese la cantidad de números aleatorios a generar:");
							cant = sc.nextInt();
						} catch (Exception e) {
							out.println("Ingrese un número correcto...");
							sc.nextLine();
						}	
					}
					random.setCantRandom(cant);
					random.CrearArchivo("Random.txt");
					out.println("Datos: " + random.getCantRandom());
					break;
				case 2:
					Integer[] arr4 = random.LeerArchivo("Random.txt");
					Integer[] sorted4 = sorts.SelectionSort(arr4);
					for (int i = 0; i != sorted4.length; i++) {
						out.println(sorted4[i].toString());
					}
					break;
				case 3:
					Integer[] ar = random.LeerArchivo("Random.txt");
					Integer[] sort = sorts.InsertionSort(ar);
					out.println(sort.toString());
					out.println(ar.toString());
					for (int i = 0; i != sort.length; i++) {
						out.println(sort[i].toString());
					}
					break;
				case 4:
					Integer[] arr3 = random.LeerArchivo("Random.txt");
					Integer[] sorted3 = sorts.MergeSort(arr3);
					for (int i = 0; i != sorted3.length; i++) {
						out.println(sorted3[i].toString());
					}
					break;
				case 5:
					Integer[] arr = random.LeerArchivo("Random.txt");
					Integer[] sorted = sorts.QuickSort(arr);
					for (int i = 0; i != sorted.length; i++) {
						out.println(sorted[i].toString());
					}
					break;
				case 6:
					sc.close();
					break;
				}
			} catch (Exception e) {
				sc.nextLine();
			}
		}
	}

}
