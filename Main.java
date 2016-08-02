/**
*MainHDT3, Clase Driver 
*@version: 2.0
*@author: Luis Sierra, 131074 // Carlos Solorzano, 08832 // Steven Rubio, 15044 // Diego Lopez, 141222
*@since 2016-08-01
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
		RandomX<Integer> random;
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
					random = new RandomX<Integer>(cant);
					random.CrearArchivo("random.txt");
					out.println("Datos: " + random.getCantRandom());
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					break;
				case 6:
					sc.close();
					break;
				}
			} catch (Exception e) {
				
			}
		}
	}

}
