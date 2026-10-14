package complejidad;

public class BusquedaBinaria { 
	

	public static int busquedaBinaria(int[] array, int valor) {       //mover punteros
		
		int izq = 0;
		int dch = array.length - 1;
		int pos = (dch - izq)/2;          //(array.length - 1) - 0)/2
		
		while (izq <= dch) {        //las iteraciones las hacemos dentro del while, primero veo lo que hay en una posicion, empiezo en el medio, 
		if(array[pos] == valor) {
			return pos;
		} else if(array[pos] > valor) {       //me muevo a la izda, pq el valor es menor
			dch = pos - 1;      
			pos = izq + ((dch - izq)/2);
			
		}else {        //busco a la derecha, pq el valor es mayor
			izq = pos + 1;
			pos = izq + ((dch - izq) /2);
			
		}
		
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 12, 14};
		System.out.println(busquedaBinaria(arr,8));   //deberia estar en la posicion 6
	}
	
	//requisito de busqueda binaria: que esten ordenados
	//yo saco la carta del medio (estoy buscando la carta 7), si la carta es menor puedo descartar las cartas menores, si cojo una carta mayor descarto las cartas mayores a la dcha, despues de 3 iteraciones descubro la carta 7
	//SELECTION SORT
	//segun destapo cartas me olvido de ellas, necesito recordarlas, empiezo con posMin=0 y su valorMin=10, paso a la siguiente carta, en este caso posMin=1 y valorMin=4, paso a la siguiente posMin=2 y valorMin=2, voy comprando las cartas y veo que no son mas pequeñas q la ultima q he comprobado, ahora la coloca en la primera posicion, la siguiente mas pequeña la tengo que colocar en la segunda posicion no en la primera pq ya esta ocupada
	//ahora colocamos la carta mas pequeña en 1 (no en la posicion 0), repetimos el proceso (tengo que actualizar los valores de posMin y valorMin)
	//en la primera busqueda posMin=1 y valorMin=4, sigo buscando posicion a posicion hasta encontrar una carta mas pequeña, hasta que llegamos a posMin=5 y valorMin=3
	//actualizo posMin=2 y valorMin=10 -> posMin=3 y valorMin=5 -> posMin=5 y valorMin=4, cuando termine de mirar todas las cartas cambio la posicion 5 a la posicion 2
	//posMin=3 y valorMin=5
	//posMin=4 y valorMin=11 -> posMin=5 y valorMin=10 -> posMin=7 y valorMin=7, cambio la posicion 7 por la 4
	//posMin=5 y valorMin=10
	//posMin =6 y valorMin=11
	//posMin=7 y valorMin=12
	//acabamos con todas las cartas ordenadas
	//PASOS
	// 1. buscamos la carta mas pequeña
	// 2. la cambiamos por la que corresponde
	// 3. repetir el proceso
}

// 3º dch = pos -1 =3
//pos = izq + ((dch - izq)/2) = 4+(3-4)/2 = 3      pos y derecha en la misma posicion, izquierda =4 y derecha =3, derecha se hace menor que izquierda, eso significa que la cartaba no estaba y por tanto tengo que dejar de buscar
