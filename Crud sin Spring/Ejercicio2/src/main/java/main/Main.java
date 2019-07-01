package main;

import main.bdd.Bdd;
import main.model.Dato;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Bdd base = new Bdd();
		
		base.agregar(new Dato("C1", "Data C1"));
		base.agregar(new Dato("T1", "Data T1"));
		base.agregar(new Dato("F1", "Data F1"));
		base.agregar(new Dato("U1", "Data U1"));
		
		System.out.println(base.listar());
		
		base.eliminar("T1");
		
		base.modificar(new Dato("C1","Datos MODIFICADOS"));
		System.out.println(base.listar());
		
	}

}
