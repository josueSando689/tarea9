package tarea9;

import java.util.Scanner;

public class CalcluladoraSwich {

	public CalcluladoraSwich (){
	}
	
	Scanner scanner = new Scanner (System.in);
	
	public void ElegirNumeros(){
		System.out.println("Elige un numero a calcular");
		int num1 = scanner.nextInt();
		System.out.println("Elige un segundo numero a calcular");
		int num2 = scanner.nextInt();
		
		System.out.println("Inserta un numero");
		System.out.println("1 para sumar");
		System.out.println("2 para restar");
		System.out.println("3 para multiplicar");
		System.out.println("4 para dividir");
		
		
		int eleccion = scanner.nextInt();
	
		
		switch(eleccion) {
		
		case 1:
			int suma = num1+num2;
			System.out.println("El resultado de " + num1+ " y " + num2 + " es = a " + suma );
			break;
			
		case 2:
			int resta = num1-num2;
			System.out.println("El resultado de " + num1+ " y " + num2 + " es = a " + resta );
			break;
		
		case 3:
			int multiplicacion =num1*num2;
			System.out.println("El resultado de " + num1+ " y " + num2 + " es = a " + multiplicacion );
			break;
			
		case 4: 
		    int division = num1/num2;
		    System.out.println("El resultado de " + num1+ " y " + num2 + " es = a " + division );
		    break;
		    
		default:
			System.out.println("No es una opcion");
			break;
		
		}
		
	}
}
