package com.floristeria.uno;

public class Decoracion1 extends Precio1{
	
	//Atributos
	
			public String Material;
			public String Precio;
			
		
			public Decoracion1 (String Material, String Precio) throws Exception {
			super(Precio);
			
			//Que no acepte campos vacios
			
			if (Material.equals(""))
				throw new Exception("Tienes que introducir una altura");
			if (Precio.equals(""))
				throw new Exception("Tienes que introducir un precio");
			
			
			//Constructores
			
			this.Material = Material;
			this.Precio = Precio;
			
	}
			// Getters i Setters

			public String getPrecio() {
				return Precio;
			}
			public String getMaterial() {
				return Material;
			}

			public void setMaterial(String material) {
				Material = material;
			}
			public void setPrecio(String precio) {
				Precio = precio;
			}
			
			//Metodos


}
