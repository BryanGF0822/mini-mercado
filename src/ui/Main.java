package ui;

import java.util.Scanner;

import model.Mini_mercado;

enum TypeofDocument{
	
	TARJETA_DE_IDENTIDAD, CEDULA_DE_CIUDADANIA, 
	PASAPORTE, CEDULA_DE_EXTRANJERIA
}

public class Main {
	
	public static Mini_mercado control;

	public static void main(String[] args) {
		
		TypeofDocument t1 = TypeofDocument.CEDULA_DE_CIUDADANIA;
		TypeofDocument t2 = TypeofDocument.TARJETA_DE_IDENTIDAD;
		TypeofDocument t3 = TypeofDocument.PASAPORTE;
		TypeofDocument t4 = TypeofDocument.CEDULA_DE_EXTRANJERIA;


		Scanner sn = new Scanner(System.in);

		boolean exit = false;
		int option;

		while (!exit) {
			
			System.out.println("BIENVENIDO A TIENDAS D1");
			System.out.println("");
			System.out.println("1. Agregar nuevo usuario para ingreso.");
			System.out.println("2. Consultar cantidad de usuarios que intentaron entrar.");
			System.out.println("3. Salir");
			System.out.println("");

			try {
				
				System.out.println("Selecciona la opcion que deseas realizar: ");
				option = Integer.parseInt(sn.nextLine());

				switch (option) {
				case 1:
					System.out.println("Selecione su tipo de documento:");
					System.out.println("1. Cedula de ciudadania");
					System.out.println("2. Tarjeta de identidad");
					System.out.println("3. Pasaporte");
					System.out.println("4. Cedula de extranjeria");
					
					int op = Integer.parseInt(sn.nextLine());
					TypeofDocument documentType;
					
					if(op == 1) {
						documentType = t1;
					}else if(op == 2) {
						documentType = t2;
					}else if(op == 3) {
						documentType = t3;
					}else if(op == 4) {
						documentType = t4;
					}
					
					System.out.println("Digite su numero de documento:");
					long idNumber = Long.parseLong(sn.nextLine());
					
					control.addClient(documentType, idNumber);
					
					break;
				case 2:
					break;
				case 3:
					exit = true;
					break;
				default:
					System.out.println("Solo numeros entre 1 y 4");
				}
			} catch (NumberFormatException e) {
				
				System.out.println("Debes insertar un numero");
				sn.hasNext();
			}

		}

	}

}
