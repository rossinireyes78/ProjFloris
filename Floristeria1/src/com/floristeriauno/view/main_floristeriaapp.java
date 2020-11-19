package com.floristeriauno.view;

import java.util.Scanner;
import com.floristeria.uno.*;



public class main_floristeriaapp {
	private static FloristeriaRepo1 añadir = new FloristeriaRepo1();


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Scanner e = new Scanner(System.in);
		System.out.print("ingrese   nombre  floristeria:    ");
		String nomf = e.next();
		System.out.print("         floristeria:    " + nomf);
		menu();
		int opcion = e.nextInt();
		while (opcion != 0) {
			if (!(opcion == 0)) {
                //AÑADE ARBOLES
				if (opcion == 1) {

					System.out.print("ingrese altura:    ");
					String altura = e.next();
					System.out.print("ingrese precio:     ");
					String precio = e.next();
					Arbol1 ar = new Arbol1(altura, precio);
					añadir.addArbol(ar);;
					//System.out.println( añadir.getAllArbols().size());
				}
				
				//AÑADE FLORES
				if (opcion == 2) {

					System.out.print("ingrese color:    ");
					String color = e.next();
					System.out.print("ingrese precio:     ");
					String precio = e.next();
					Flor1 flr =new Flor1(color, precio);
					añadir.addFlor(flr);
					//System.out.println( añadir.getAllArbols().size());
				}

				//3 ñade decoraciones
				
				if (opcion == 3) {

					System.out.print("ingrese material:    ");
					menu1();
					
					String material = e.next();
					int opcion1 = e.nextInt();
					while (opcion1 != 0) {
					if (opcion1 == 1) {
						
					System.out.println("plastico");
					}
					if (opcion1 == 2) {
						System.out.println("material:   madera");
					}
					System.out.println("ingrese precio:     ");
					String precio = e.next();
					Decoracion1 mop =new Decoracion1(material, precio);
					añadir.addDecoracion(mop);
					//System.out.println( añadir.getAllArbols().size());
				}

				
				
				// Cas 4 = Stock
				
				if (opcion == 4) {
					System.out.println( "STOCKS ARBOLES:  "+añadir.getArbol11s());
					System.out.println( "STOCKS FLORES:  " +añadir.getAllFlors().size());
					System.out.println( "STOCKS DECORACIONES:  "+añadir.getAllDecoracion().size());
				}

				}

			menu();
			opcion = e.nextInt();
		}
		e.close();
		}
	}
	public static void menu() {
		System.out.println("      \n Elige lo que deseas hacer     ");
		System.out.println("[1] AÑADE ARBOL");
		System.out.println("[2] AÑADE FLOR");
		System.out.println("[3] AÑADE DECORACION ");
		System.out.println("[4] STOCK");
		System.out.println("[0] SALIR");
	}

	public static void menu1() {
		System.out.println("[1] plastico   + [2] madera  ");
	}

	}


