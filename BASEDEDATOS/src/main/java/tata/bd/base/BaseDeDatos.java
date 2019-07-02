package tata.bd.base;

import java.util.ArrayList;
import java.util.Iterator;

import tata.bd.dato.Dato;

public class BaseDeDatos {
	/*****************ATRIBUTOS********************/
	ArrayList<Dato> base;
	/*****************CONSTRUCTORES********************/
	public BaseDeDatos() {
		this.base = new ArrayList<Dato>();
	}
	/*****************CRUD********************/
	public boolean agregar(Dato nuevo) {
		return this.base.add(nuevo);
	}
	public ArrayList<Dato> listar(){
		return this.base;
	}
	public boolean eliminar(String id) {
		Iterator<Dato> ite = this.base.iterator();
		while(ite.hasNext()) {
			if(ite.next().getId().equalsIgnoreCase(id)) {
				ite.remove();
				return true;
			}
		}
		return false;
	}
	public boolean modificar(Dato d) {
		Iterator<Dato> ite = this.base.iterator();
		while(ite.hasNext()) {
			Dato temp = ite.next();
			if(temp.getId().equalsIgnoreCase(d.getId())) {
				temp.setData(d.getData());
				return true;
			}
		}
		return false;
	}
}