package ar.edu.ies6.main.punto1;

import ar.edu.ies6.model.punto1.Producto;
import ar.edu.ies6.util.punto1.OrigenFabricacion;
import ar.edu.ies6.util.punto1.Categoria;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		 ArrayList<Producto> productos = new ArrayList<>();
		 
		 productos.add(new Producto("P1", "Smartv", 45000, OrigenFabricacion.CHINA, Categoria.TELEFONIA));
	     productos.add(new Producto("P2", "Laptop", 120000, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA));
	     productos.add(new Producto("P3", "Secarropa", 70000, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
	     productos.add(new Producto("P4", "Pizarra", 15000, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS));
	     productos.add(new Producto("P5", "Monitor", 40000, OrigenFabricacion.CHINA, Categoria.INFORMATICA));

	        for (Producto producto : productos) {
	            System.out.println(producto);
	        }
	    }
	}