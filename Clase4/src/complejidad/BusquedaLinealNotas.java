package complejidad;

public class BusquedaLinealNotas {   //busqueda lineal: sirve para encontrar un valor dentro de un array.
	
	public static int busquedaLineal(int[] array, int valor) {  //int[] array: el array en el que quieres buscar, int valor: el número que quieres encontrar.
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == valor) {   
				return i; //me devuelve la posicion (i)
			}
		}
		
		return -1; //en caso de no encontrar el valor me devuelve -1
	}
	
	
	public static void main(String[] args) {
			int[] arr = {1, 4, 7, 9, 2, 0, 13};
			System.out.println(busquedaLineal(arr, 100));
		}
}

//busco 7
//1º izq = 0; dch= arr.length -1
//int pos = (dch - izq)/2 = 3,5 = 3
//izq = pos + 1 (me muevo a la dcha)
//pos = izq + ((dch -izq)/2) = 4 + (7-4)/2 = 4+1,5 = 5
//2º arr[pos] me muevo a la izda
//dch = pos -1
//pos = izq + ((dch - izq)/2) = izq + 0 = 4, pos lo muevo a 4, tenemos los 3 punteros ahi posicion absoluta (pos), posicion relativa (dch - izq)
//3º he terminado de buscar pq he encontrado la carta, tengo ahra q devolver la posicion, izq, dch y pos estan en la misma posicion
