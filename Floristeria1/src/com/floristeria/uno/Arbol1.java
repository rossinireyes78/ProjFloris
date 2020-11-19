package com.floristeria.uno;

public class Arbol1 extends Precio1 {
	//Atributos
	
			public String Altura;
			public String Precio;
		
		
			public Arbol1(String Altura, String Precio) throws Exception {
			super(Precio);
			
			//Que no acepte campos vacios
			
			if (Altura.equals(""))
				throw new Exception("Tienes que introducir una altura");
			if (Precio.equals(""))
				throw new Exception("Tienes que introducir un precio");
			
			
			//Constructores
			
			this.Altura = Altura;
			this.Precio = Precio;
			
	}
			// Getters i Setters

			public String getAltura() {
				return Altura;
			}
			public void setAltura(String altura) {
				Altura = altura;
			}

			public String getPrecio() {
				return Precio;
			}
			public void setPrecio(String precio) {
				Precio = precio;
			}

			//Metodos
			

}
