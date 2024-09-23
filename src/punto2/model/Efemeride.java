package punto2.model;

import punto2.util.Mes;

public class Efemeride {
    private String codigo;
    private String nombre;
    private Mes mes;
    private int dia;
    private String detalle;

    public Efemeride(String codigo, String nombre, Mes mes, int dia, String detalle) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.mes = mes;
        this.dia = dia;
        this.detalle = detalle;
    }
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public String toString() {
        return "Efemeride{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", mes=" + mes +
                ", dia=" + dia +
                ", detalle='" + detalle + '\'' +
                '}';
    }
}