package punto2.main;

import punto2.model.Efemeride;
import punto2.util.Mes;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Efemeride> efemerides = new ArrayList<>();

        efemerides.add(new Efemeride("E1", "Día de la Mujer", Mes.MARZO, 8, "Conmemoración de los derechos de la mujer"));
        efemerides.add(new Efemeride("E2", "Día del Maestro", Mes.SEPTIEMBRE, 11, "Celebración del día del maestro en Argentina"));
        efemerides.add(new Efemeride("E3", "Día de la Primavera", Mes.SEPTIEMBRE, 21, "Celebración del inicio de la primavera"));
        efemerides.add(new Efemeride("E4", "Día de la Memoria", Mes.MARZO, 24, "Conmemoración de las víctimas de la dictadura"));
        efemerides.add(new Efemeride("E5", "Día del Amigo", Mes.JULIO, 20, "Celebración de la amistad"));


        System.out.println("Lista de las 5 efemérides:");
        for (Efemeride efemeride : efemerides) {
            System.out.println(efemeride.getNombre() + " - " + efemeride.getDia() + " de " + efemeride.getMes());
        }
        efemerides.remove(2);
        Efemeride segundaEfemeride = efemerides.get(1);
        segundaEfemeride.setNombre("Día del Estudiante");
        segundaEfemeride.setDetalle("Celebración de los estudiantes en Argentina");

        System.out.println("Lista de las 4 efemérides restantes:");
        for (Efemeride efemeride : efemerides) {
            System.out.println(efemeride.getNombre() + " - " + efemeride.getDia() + " de " + efemeride.getMes());
        }
    }
}