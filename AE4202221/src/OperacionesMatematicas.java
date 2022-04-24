import java.util.Scanner;

public class OperacionesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*introducir 2 números enteros positivos y a continuación realizar las 4 operaciones
		 *básicas matemáticas (suma, resta, multiplicación y división) sin el uso de métodos 
		 *para posteriormente visualizar sus resultados.
		 *
		 *autor: David Villanueva
		 *version 1
		 *fecha: 24/04/2022*/
		
		int num1, num2;
		int suma, resta, multiplicacion, division;
		
		Scanner teclado =new Scanner(System.in);
		
		System.out.print( "Introduzca el primer número: " );
        num1 = teclado.nextInt();
        System.out.print( "Introduzca el segundo número: " );
        num2 = teclado.nextInt();
 
		suma = sumaNumeros(num1, num2);
		resta = restaNumeros(num1, num2);
		multiplicacion = multiplicaNumeros(num1, num2);
		division = divideNumeros(num1, num2);
		
		resultados(num1, num2, suma, resta, multiplicacion, division);
	}

	public static void resultados(int num1, int num2, int suma, int resta, int multiplicacion, int division) {
		System.out.println("La suma de " + num1 + " + " + num2 + " es: " + suma);
		System.out.println("La resta de " + num1 + " - " + num2 + " es: " + resta);
		System.out.println("El producto de " + num1 + " x " + num2 + " es: " + multiplicacion);
		System.out.println("El cociente de " + num1 + " / " + num2 + " es: " + division);
	}

	public static int divideNumeros(int num1, int num2) {
		int division;
		division= num1/num2;
		return division;
	}

	public static int multiplicaNumeros(int num1, int num2) {
		int multiplicacion;
		multiplicacion=num1*num2;
		return multiplicacion;
	}

	public static int sumaNumeros(int num1, int num2) {
		int suma;
		suma = num1+num2;
		return suma;
	}

	public static int restaNumeros(int num1, int num2) {
		int resta;
		resta=num1-num2;
		return resta;
	}

}
