package punto4.main;

import punto4.model.compra;
import ar.edu.ies6.model.punto1.Producto;
import ar.edu.ies6.util.punto1.Categoria;
import ar.edu.ies6.util.punto1.OrigenFabricacion;
import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		Producto[] productos = new Producto[10];
		
		productos[1] = new Producto("P1", "Smartv", 45000, OrigenFabricacion.CHINA, Categoria.TELEFONIA);
        productos[2] = new Producto("P2", "Laptop", 120000, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA);
        productos[3] = new Producto("P3", "Secarropa", 70000, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR);
        productos[4] = new Producto("P4", "Pizarra", 15000, OrigenFabricacion.URUGUAY, Categoria.HERRAMIENTAS);
        productos[5] = new Producto("P5", "Monitor", 40000, OrigenFabricacion.CHINA, Categoria.INFORMATICA);
        productos[6] = new Producto("P6", "Microondas", 25000, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR);
        productos[7] = new Producto("P7", "Cocina", 90000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR);
        productos[8] = new Producto("P8", "Tablet", 45000, OrigenFabricacion.CHINA, Categoria.INFORMATICA);
        productos[9] = new Producto("P9", "Cortadora de fruta", 35000, OrigenFabricacion.BRASIL, Categoria.HERRAMIENTAS);
        productos[10] = new Producto("P10", "Celular Motorola", 15000, OrigenFabricacion.CHINA, Categoria.TELEFONIA);

        compra[] compras = new compra[3];
        compras[1] = new compra("C1", LocalDate.now(), productos[1], 2); 
        compras[2] = new compra("C2", LocalDate.now(), productos[3], 1); 
        compras[3] = new compra("C3", LocalDate.now(), productos[8], 3); 
        for (compra compra : compras) {
            compra.imprimirRecibo();
        }
    }
}
