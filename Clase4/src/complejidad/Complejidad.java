package complejidad;

public class Complejidad {

	public static void main(String[] args) {
		
		int n = 1;
		for(int i = 0; i < n; i++) {
			System.out.print("hola");
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <n; j++) {
				System.out.print("hola");
			}
		}
	}

}

//si n=1, ambos bucles el trabajo se repate por la mitad, ambos hacen el mismo trabajo porq al ejecutar el 2º bucle, el programa se sale fuera de ambos bucles
//complejidad del programa O(n) + O(n^2)
//cuando el problema lo divido en trozos mas peqeños (/=2), equivale a un logaritmo
//while(restantes > 1){ restantes /=2 es una funcion logarimica
//suma += datos[i] -> O(1) pq es solo una operacion