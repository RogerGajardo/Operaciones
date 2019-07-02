package tata.bd;

import tata.bd.base.BaseDeDatos;
import tata.bd.dato.Dato;

public class App {

	public static void main(String[] args) {
		BaseDeDatos base = new BaseDeDatos();
		base.agregar(new Dato("C1","DATA C1"));
		base.agregar(new Dato("A1","DATA A1"));
		base.agregar(new Dato("J1","DATA J1"));
		base.agregar(new Dato("F1","DATA F1"));
		
		System.out.println("LISTANDO: " + base.listar());
		
		base.eliminar("J1");
		base.modificar(new Dato("F1", "CUALQUIER OTRA COSA"));
		System.out.println("LISTANDO: " + base.listar());

	}
}
