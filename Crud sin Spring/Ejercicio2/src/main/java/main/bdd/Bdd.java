package main.bdd;

import java.util.ArrayList;
import java.util.Iterator;

import main.model.Dato;

public class Bdd {
	
	ArrayList<Dato> base;
	
	public Bdd() {
		this.base = new ArrayList<Dato>();
		
	}
	
	public boolean agregar(Dato nuevo) {
		return this.base.add(nuevo);
	}
	public ArrayList<Dato> listar(){
		return this.base;
	}
	
	public boolean eliminar(String id) {
		Iterator<Dato> ite = this.base.iterator();
		while (ite.hasNext()) {
			if (ite.next().getId().equalsIgnoreCase(id)) {
				ite.remove();
				return true;
			}
		}
		return false;
	}
	
	public boolean modificar(Dato mod) {

		for (Dato temp : base) {
			if (temp.getId().equalsIgnoreCase(mod.getId())) {
					temp.setData(mod.getData());
					return true;
			}
		}
		return false;
	}
	
	
}
