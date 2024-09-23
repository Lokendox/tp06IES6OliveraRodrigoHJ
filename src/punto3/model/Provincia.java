package punto3.model;	

import punto3.util.region;

public class Provincia {
    private String identificador;
    private String nombre;
    private region region;
    private int poblacion;
    private double superficie;
    private boolean estado;

    public Provincia(String identificador, String nombre, region region, int poblacion, double superficie, boolean estado) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.region = region;
        this.poblacion = poblacion;
        this.superficie = superficie;
        this.estado = estado;
    }
    
    public double calcularDensidadPoblacional() {
        return poblacion / superficie;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public region getRegion() {
        return region;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public String toString() {
        return "Provincia{" +
                "identificador='" + identificador + '\'' +
                ", nombre='" + nombre + '\'' +
                ", region=" + region +
                ", poblacion=" + poblacion +
                ", superficie=" + superficie +
                ", estado=" + estado +
                ", densidad poblacional=" + calcularDensidadPoblacional() +
                '}';
    }
}
