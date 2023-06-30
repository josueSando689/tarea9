package tarea9;

import java.util.Scanner;

public class MenuComida {

	public MenuComida() {
	}
	
	public void menu () {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Selecciona tu comida: ");
		System.out.println("");
		System.out.println("1 para Spaggetti: ");
		System.out.println("2 para Taco: ");
		System.out.println("3 para Hamburguesa: ");
		System.out.println("4 para Pizza: ");
		System.out.println("5 para Torta: ");
		
		int eleccion= scanner.nextInt();
		
		String alimento;
		
		switch(eleccion) {
		
		case 1:
		alimento = "Spaggetti";
		System.out.println("Elegiste " + alimento);
		break;
		
		case 2:
		alimento = "Taco";
		System.out.println("Elegiste " + alimento);
		break;
		
		case 3:
		alimento = "Hamburguesa";
		System.out.println("Elegiste " + alimento);
		break;
		
		case 4:
		alimento = "Pizza";
		System.out.println("Elegiste " + alimento);
		break;
		
		case 5:
		alimento = "Torta";
		System.out.println("Elegiste " + alimento);
		break;
		
		default:
		System.out.println("No es una opcion: ");
		break;
		
		}
         scanner.close();
	}
}
