package Modelo;

public class Lista {

	private Nodo primero;
	private Nodo ultimo;

	public Lista() {
		primero = null;
		ultimo = null;
	}

	public Nodo leerUltimo() {
		return ultimo;
	}

	public Nodo leerPrimero() {
		return primero;
	}

	public Lista insertarCabezaLista(Object entrada) {
		Nodo nuevo;
		nuevo = new Nodo(entrada);
		nuevo.enlace = primero;
		if (primero == null)
			ultimo = nuevo;
		primero = nuevo;
		return this;
	}

	public void Visualizar() {
		Nodo indice;
		for (indice = primero; indice != null; indice = indice.enlace) {
			int num = (int) indice.leerDato();
			System.out.print(num + ", ");
		}
	}

	public boolean Busqueda(int n) {
		boolean existe = false;
		Nodo indice;
		for (indice = primero; indice != null; indice = indice.enlace) {
			int num = (Integer) indice.leerDato();
			if (n == num)
				existe = true;
		}
		return existe;
	}

	public void Busq(boolean existencia) {
		if (existencia == true) {
			System.out.println("El elemento si existe.");
		} else
			System.out.println("El elemento no existe.");
	}

	public void eliminar(String entrada) {
		Nodo actual, anterior;
		boolean encontrado;
		actual = primero;
		anterior = null;
		encontrado = false;

		while ((actual != null) && (!encontrado)) {
			encontrado = (actual.dato == entrada);
			if (!encontrado) {
				anterior = actual;
				actual = actual.enlace;
			}
		}
		if (actual != null) {

			if (actual == primero) {
				primero = actual.enlace;
			} else {
				anterior.enlace = actual.enlace;
			}
			actual = null;
		}
	}
}
