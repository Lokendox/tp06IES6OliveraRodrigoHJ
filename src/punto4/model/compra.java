package punto4.model;

import java.time.LocalDate;

import ar.edu.ies6.model.punto1.Producto;

public class compra {
	 private String codigo;
	    private LocalDate fechaCompra;
	    private Producto producto;
	    private int cantidad;
	    
	    public compra(String codigo, LocalDate fechaCompra, Producto producto, int cantidad) {
	        this.codigo = codigo;
	        this.fechaCompra = fechaCompra;
	        this.producto = producto;
	        this.cantidad = cantidad;
}
	    public double calcularPrecioTotal() {
	        return producto.getPrecioUnitario() * cantidad;
	    }
	    
	    public void imprimirRecibo() {
	        System.out.println("Recibo de compra:");
	        System.out.println("Código de compra: " + codigo);
	        System.out.println("Fecha de compra: " + fechaCompra);
	        System.out.println("Producto: " + producto.getDescripcion());
	        System.out.println("Precio unitario: $" + producto.getPrecioUnitario());
	        System.out.println("Cantidad: " + cantidad);
	        System.out.println("Precio total: $" + calcularPrecioTotal());
	        System.out.println("-------------------------------");
	    }
}