package com.floristeria.uno;

public class Flor1 extends Precio1 {
	//Atributos
	
			public String Color;
		
		
			public Flor1(String color, String precio) throws Exception {
				super(precio);
				Color = color;
			
			
			
			//Que no acepte campos vacios
			
			if (Color.equals(""))
				throw new Exception("Tienes que introducir un color");
	        if (precio.equals(""))
				throw new Exception("Tienes que introducir un precio");
			
			
			//Constructores
			
			this.Color = color;
			this.precio = precio;
			
	}
			// Getters i Setters

			public String getColor() {
				return Color;
			}


			
			public void setColor(String color) {
				Color = color;
			}
			
			

}
