package ui;

import java.util.Scanner;

import Exceptions.IdNumberException;
import Exceptions.TarjetaDeIdentidadException;
import model.*;


public class Main {
	
	public static Mini_mercado control;

	public static void main(String[] args) {
		
		control = new Mini_mercado();
		
		Scanner sn = new Scanner(System.in);
		
		int contador = 0;
		boolean exit = false;
		int option;

		while (!exit) {
			
			System.out.println("BIENVENIDO A TIENDAS D1");
			System.out.println("");
			System.out.println("1. Agregar nuevo usuario para ingreso.");
			System.out.println("2. Consultar cantidad de usuarios que intentaron entrar.");
			System.out.println("3. Salir :D");
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
					TypeofDocument documentType = null;
					
					if(op == 1) {
						documentType = TypeofDocument.CEDULA_DE_CIUDADANIA;
					}else if(op == 2) {
						documentType = TypeofDocument.TARJETA_DE_IDENTIDAD;
					}else if(op == 3) {
						documentType = TypeofDocument.PASAPORTE;
					}else if(op == 4) {
						documentType = TypeofDocument.CEDULA_DE_EXTRANJERIA;
					}
					
					System.out.println("Digite su numero de documento:");
					long idNumber = Long.parseLong(sn.nextLine());
					
					String s = String.valueOf(idNumber);
					int i =s.length();
					String c = s.charAt(i-2)+"";
					int j = Integer.parseInt(c);
					
//					if(documentType == TypeofDocument.TARJETA_DE_IDENTIDAD || puedeIngresar(j) == false) {
//						System.out.println("Este cliente no puede ingresar hoy :)");
//					}else {
//						control.addClient(documentType, idNumber);
//					}
					
					boolean confirmacionPaso2 = false;
					try {
						
						control.puedeIngresar(j);
						confirmacionPaso2 = true;
						
					}catch(IdNumberException e){
						
						System.out.println(e.getMessage());
					}
					
					if(confirmacionPaso2 == true) {
						
						try {
							control.addClient(documentType, idNumber);
							
						}catch(TarjetaDeIdentidadException e) {
							
							System.out.println( e.getMessage());
						}
					}
					
					contador++;
					
					
					break;
				case 2:
					System.out.println("El numero de usuarios que intentaron entrar es: " + contador);
					break;
				case 3:
					exit = true;
					break;
				default:
					System.out.println("Solo numeros entre 1 y 4");
				}
			} catch (NumberFormatException e) {
				
				System.out.println("Debes insertar un numero");
				sn.nextLine();
			}
			
			//System.out.println(control.getClients().size());

		}
		sn.close();
	}

//	private static boolean puedeIngresar(int j) {
//		boolean retorno = false;
//		LocalDate ld = LocalDate.now();
//		int dia = ld.getDayOfMonth();
//		if (j%2 == 0) {
//			if (!(dia%2==0)) {
//				retorno = true;
//			}
//		}else {
//			if (dia%2==0) {
//				retorno = true;
//			}
//		}
//		return retorno;
//	}

}