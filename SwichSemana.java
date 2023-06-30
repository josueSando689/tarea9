package tarea9;

import java.util.Scanner;

public class SwichSemana {

	private String dia;
	
	public SwichSemana (String dia){
		this.dia =dia; 
	}
	
	
	public String Setdia (String dia) {
		return dia;
	}
	

	public void semanaNumero() {
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Escribe un numero del 1 al 7 para saber que dia de la semana es");
		int numeroSemana = scanner.nextInt();
		
		switch (numeroSemana) {
		
		case 1: 
			dia = "Lunes";
			break;
		
		case 2:
			dia = "Martes";
			break;
		
		case 3:
			dia = "Miercoles";
			break;
			
		case 4: 
			dia = "Jueves";
			break;
		
		case 5:
			dia = "Viernes";
			break;
		
		case 6:
			dia = "Sabado";
			break;
			
		case 7:
			dia= "Domingo";
			break;
			
		default:
			System.out.println("No es un numero correcto del 1 al 7");
			break;
		}
		
		System.out.println("El dia de la semana es " + dia);
		scanner.close();
	}

}
