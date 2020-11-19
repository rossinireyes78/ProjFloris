package com.floristeria.uno;

import java.util.ArrayList;
import java.util.List;



public class FloristeriaRepo1 {


	private static List<Arbol1> a=new ArrayList<>();
	private static List<Flor1> f=new ArrayList<>();
	private static List<Decoracion1> d=new ArrayList<>();
	public FloristeriaRepo1() {
		
	}
	
	//agregar arbol
	
	
	
	public void addArbol(Arbol1 ar) throws Exception{
		if(ar==null) throw new Exception() ;
		a.add(ar);
	}
	

	
	public List<Arbol1> getArbol11s(){
		return new ArrayList<>(a);
	}

	// agregar flor
	public List<Flor1> getAllFlors(){
		return new ArrayList<>(f);
	}
	
	
	public void addFlor(Flor1 flo) throws Exception{
		if(flo==null) throw new Exception() ;
		f.add(flo);
	}
	
	//agregar decoracion
	public List<Decoracion1> getAllDecoracion(){
		return new ArrayList<>(d);
	}
	
	
	public void addDecoracion(Decoracion1 dec) throws Exception{
		if(dec==null) throw new Exception() ;
		d.add(dec);
	}

	

	/*public List<Flor1> getAllArbols() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public String toString() {
		return "getAllArbols " + getArbol11s().size() + ", getAllFlors" + getAllFlors().size()
				+ ", getAllDecoracion " + getAllDecoracion().size() ;
	}
	

}
