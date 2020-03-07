package Controlador;

import java.util.Scanner;

import Modelo.Lista;

public class Controlador {

	static Lista lista = new Lista();
	static Scanner sc = new Scanner(System.in);

	public Controlador() {
		menu();
	}

	public void menu() {

		System.out.println("\n" + "Bienvenido, seleccione una opción, no se admiten caracteres especiales:");
		System.out.println("1. Lista Enlazada Simple");
		System.out.println("2. Lista Enlazada Doble");
		System.out.println("3. Lista Enlazada Circular");
		System.out.println("4. Pila Dinámica sobre Lista Enlazada Doble");
		System.out.println("5. Cola Dinámica sobre Lista Enlazada Simple");
		System.out.println("6. Salir." + "\n");
		String op = sc.next();

		if (!op.matches("[1-6]")) {
			System.out.println("Ingrese una opción válida.");
			menu();
		}
		switch (op) {

		case "1":
			menuListaEnlazadaSimple();
			break;

		case "2":
			break;

		case "3":
			break;

		case "4":
			break;

		case "5":
			break;

		case "6":
			System.out.println("Ejecución finalizada.");
			System.exit(0);
			break;

		default:
			break;
		}

	}

	public void menuListaEnlazadaSimple() {
		System.out.println("\n" + "*** Lista Enlazada Simple ***");
		System.out.println("1. Agregar elemento");
		System.out.println("2. Quitar elemento");
		System.out.println("3. Buscar elemento");
		System.out.println("4. Salir");
		String op = sc.next();

		if (!op.matches("[1-4]")) {
			System.out.println("Ingrese una opción válida.");
			menuListaEnlazadaSimple();
		}
		switch (op) {

		case "1":
			System.out.println("Ingrese el número que desea agregar.");
			String in = sc.next();
			if (!in.matches("[0-9]*")) {
				System.out.println("Ingrese solo números enteros.");
				in = sc.next();
			}
			lista.insertarCabezaLista(Integer.parseInt(in));
			menuListaEnlazadaSimple();
			break;

		case "2":
			System.out.println("Ingrese el número que desea quitar.");
			String in2 = sc.next();
			if (!in2.matches("[0-9]*")) {
				System.out.println("Ingrese solo números enteros.");
				in2 = sc.next();
			}
			lista.Visualizar();
			lista.eliminar(in2);
			// menuListaEnlazadaSimple();
			lista.Visualizar();
			break;

		case "3":
			System.out.println("Ingrese el número que desea buscar.");
			String in3 = sc.next();
			if (!in3.matches("[0-9]*")) {
				System.out.println("Ingrese solo números enteros.");
				in3 = sc.next();
			}
			lista.Busq(lista.Busqueda(Integer.parseInt(in3)));
			menuListaEnlazadaSimple();

			break;

		case "4":
			System.out.println("Ejecución finalizada.");
			System.exit(0);
			break;

		default:
			break;
		}

	}
}
