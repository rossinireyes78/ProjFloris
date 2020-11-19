package com.floristeria.uno;

import java.util.List;

//import com.floristeria.uno.*;

public class Floristeria1 {

	//Atributos

		private String Nombre;
		private List<Arbol1> Arboles;
		private List<Flor1> Flores;
		private List<Decoracion1> decoracion;
		
		//Constructor
		
		public Floristeria1(String nombre) {
			super();
			Nombre = nombre;
			
		}
		
		//Getters i setters
		
		public String getNombre() {
			return Nombre;
		}
		public String setNombre() {
			return Nombre;
		}
		public List<Arbol1> getArboles() {
			return Arboles;
		}
		public void setArboles(List<Arbol1> arboles) {
			Arboles = arboles;
		}
		public List<Flor1> getFlores() {
			return Flores;
		}
		public void setFlores(List<Flor1> flores) {
			Flores = flores;
		}
		public List<Decoracion1> getDecoracion() {
			return decoracion;
		}
		
		
		public void setDecoracion(List<Decoracion1> decoracion) {
			this.decoracion = decoracion;
		}

		@Override
		public String toString() {
			return "Arboles" + Arboles ;
		}
		
		
		
		

}
