package pryectoGordis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import utilidades.Utilidades;

public class MainGordis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu=0;
		ArrayList <Persona> a= new ArrayList<Persona>();		
		do {
			menu=menu();
			switch (menu) {
			case 1:
				Alta(a);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("AGUR");
				break;
			}
			
		}while(menu!=5);
	}

	
	
	
	public static int menu() {
		 System.out.println("1. ALTA GORDI/PESADOR.");
		 System.out.println("2. M LISTADO DE GORDIS");
		 System.out.println("3. AÑADIR UNA MEDICIÓN A UN GORDI Y VER SU EVOLUCIÓN)");
		 System.out.println("4. ESTADISTICA DE GORDI)");
		 System.out.println("5. Salir");
		 return Utilidades.leerInt(1,5);
	}

	public static void Alta(ArrayList <Persona> a) {
		String opcion;
		String Nombre;
		double altura;
		LocalDate fecha;
		System.out.println("Que quieres introducir)");
		System.out.println("1. Gordi");
		System.out.println("2. Pesador");
		opcion = Utilidades.introducirCadena("Gordi", "Pesador");
		
		if(opcion.equalsIgnoreCase("Gordi")) {
			System.out.println("Escribe el nombre");
			Nombre=Utilidades.introducirCadena();
			System.out.println("Escribe la fecha de nacimiento");			
			fecha=Utilidades.leerFechaDMA();
			System.out.println("Cual es la altura?");
			altura=Utilidades.leerDouble();
			Persona p = new Gordis(Nombre, fecha, altura);
		}
	}


}
